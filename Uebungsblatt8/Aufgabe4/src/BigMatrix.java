import java.util.concurrent.ThreadLocalRandom;


public class BigMatrix {

    private double[][] values;
    private int dimension;

    public BigMatrix(int dim) {
        if (dim < 1) {
            throw new IllegalArgumentException("Dimension needs to be bigger than 0.");
        }
        dimension = dim;
        values = new double[dim][];
        for (int i = 0; i < dim; i++) {
            values[i] = new double[dim];
        }
    }

    public double get(int i, int j) {
        return values[i][j];
    }

    public void set(int i, int j, double v) {
        values[i][j] = v;
    }

    public int getDimension() {
        return dimension;
    }

    public void randomInit() {
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                values[i][j] = ThreadLocalRandom.current().nextDouble();
            }
        }
    }

    public BigMatrix add(BigMatrix ref) {
        if (dimension != ref.getDimension()) {
            throw new IllegalArgumentException("Matrices need to have the same dimension.");
        }
        BigMatrix result = new BigMatrix(dimension);
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                result.set(i, j, values[i][j] + ref.get(i, j));
            }
        }
        return result;
    }

    public BigMatrix multiplyST(BigMatrix ref) {
        if (dimension != ref.getDimension()) {
            throw new IllegalArgumentException("Matrices need to have the same dimension.");
        }
        BigMatrix result = new BigMatrix(dimension);
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                double value = 0;
                for (int k = 0; k < dimension; k++) {
                    value += values[i][k] * ref.get(k, j);
                }
                result.set(i, j, value);
            }
        }
        return result;
    }

    public BigMatrix multiplyMT(BigMatrix ref) {
        if (dimension != ref.getDimension()) {
            // error
        }
        int minMultiplicationsPerThread = 10000000;
        int maxThreads = Runtime.getRuntime().availableProcessors();

        int minMatrixElements = minMultiplicationsPerThread / dimension;
        // calculation of every element of the matrix takes dimension times multiplications

        int threadAmount = Math.min(maxThreads, dimension * dimension / minMatrixElements);

        int elements = (int) Math.ceil((double) dimension * dimension / threadAmount);

        PartialMultiplyThread[] threads = new PartialMultiplyThread[threadAmount];

        for (int i = 0; i < threadAmount; i++) {
            threads[i] = new PartialMultiplyThread(this, ref,
                    i * elements, Math.min((i + 1) * elements, dimension * dimension));
            threads[i].start();
        }

        BigMatrix result = new BigMatrix(dimension);

        for (int i = 0; i < threadAmount; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            result = result.add(threads[i].getResult());
        }

        return result;
    }
}
