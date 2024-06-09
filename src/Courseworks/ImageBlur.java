package Courseworks;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class ImageBlur {
    public static void main(String[] args) throws IOException {
        BufferedImage inputImage = ImageIO.read(new File("image.jpg"));
        WritableRaster inputRaster = inputImage.getRaster();

        int width = inputImage.getWidth();
        int height = inputImage.getHeight();

        BufferedImage outputImage = new BufferedImage(width, height, inputImage.getType());
        WritableRaster outputRaster = outputImage.getRaster();

        final int MATRIX_SIZE = 3;
        final int COLORS_COUNT_IN_RGB = 3;

        double[][] matrix = new double[MATRIX_SIZE][MATRIX_SIZE];
        double matrixValue = 1.0 / (MATRIX_SIZE * MATRIX_SIZE);

        for (int i = 0; i < MATRIX_SIZE; i++) {
            for (int j = 0; j < MATRIX_SIZE; j++) {
                matrix[i][j] = matrixValue;
            }
        }

        int indent = MATRIX_SIZE / 2;
        int yUpperLimit = height - indent;
        int xUpperLimit = width - indent;
        int[] pixel = new int[COLORS_COUNT_IN_RGB];
        double[] sums = new double[COLORS_COUNT_IN_RGB];

        for (int y = indent; y < yUpperLimit; y++) {
            for (int x = indent; x < xUpperLimit; x++) {
                Arrays.fill(sums, 0);

                for (int neighborPixelY = y - indent, i = 0; i < MATRIX_SIZE; neighborPixelY++, i++) {
                    for (int neighborPixelX = x - indent, j = 0; j < MATRIX_SIZE; neighborPixelX++, j++) {
                        inputRaster.getPixel(neighborPixelX, neighborPixelY, pixel);

                        for (int k = 0; k < COLORS_COUNT_IN_RGB; k++) {
                            sums[k] += pixel[k] * matrix[i][j];
                        }
                    }
                }

                for (int i = 0; i < COLORS_COUNT_IN_RGB; i++) {
                    if (sums[i] <= 0) {
                        pixel[i] = 0;
                    } else if (sums[i] >= 255) {
                        pixel[i] = 255;
                    } else {
                        pixel[i] = (int) Math.round(sums[i]);
                    }
                }

                outputRaster.setPixel(x, y, pixel);
            }
        }

        ImageIO.write(outputImage, "jpg", new File("out3.jpg"));
    }
}