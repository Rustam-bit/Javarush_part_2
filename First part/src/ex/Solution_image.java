package src.ex;

import src.ex.common.ImageReader;
import src.ex.common.ImageTypes;

public class Solution_image {
    public static void main(String[] args) {
        ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);
    }
}

