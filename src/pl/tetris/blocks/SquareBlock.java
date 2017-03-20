package pl.tetris.blocks;

public class SquareBlock implements Block {

    private Square shape[][];

    public SquareBlock(Square color, int size){
        shape = new Square[size][size];

        for(int i=0; i < shape.length; i++)
            for(int j=0; j < shape[i].length; j++)
                shape[i][j] = color;
    }

    @Override
    public Square[][] getShape() {
        return shape;
    }

    @Override
    public void rotateRight() {
        //Zbędne
    }

    @Override
    public void rotateLeft() {
        //Zbędne
    }

    @Override
    public void revertMove() {
        //Zbędne
    }
}
