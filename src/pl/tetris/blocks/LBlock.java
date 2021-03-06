package pl.tetris.blocks;

public class LBlock implements Block {

    private Square shape[][];
    private Square backupShape[][];
    private int x;
    private int y;

    public LBlock(Square color) {
        this(color, 3);
    }

    public LBlock(Square color, int size) {
        shape = new Square[size][size];
        backupShape = null;
        x = 0;
        y = 0;

        for(int i=0; i < shape.length; i++)
            for(int j=0; j < shape[i].length; j++) {
                if (j >= size - 1)
                    shape[i][j] = color;
                else if (i >= size - 1)
                    shape[i][j] = color;
                else
                    shape[i][j] = Square.BLANK;
            }
    }

    @Override
    public Square[][] getShape() {
        return shape;
    }

    @Override
    public void rotateRight() {
        backupShape = shape;
        shape = new Square[shape[0].length][shape.length];

        for(int i=0, k = shape[0].length - 1; i < backupShape.length; i++, k--)
            for(int j=0; j < backupShape[i].length; j++){
                shape[j][k] = backupShape[i][j];
            }
    }

    @Override
    public void rotateLeft() {
        backupShape = shape;
        shape = new Square[shape[0].length][shape.length];

        for(int i=0, k=0; i < backupShape.length; i++, k++)
            for(int j=backupShape[i].length - 1, l = 0; j >= 0; j--, l++)
                shape[l][k] = backupShape[i][j];
    }

    @Override
    public void revertMove() {
        if(backupShape != null)
            shape = backupShape;
    }

    @Override
    public void setX(int x){
        if(x >= 0) this.x = x;
    }

    @Override
    public int getX(){
        return x;
    }

    @Override
    public void setY(int y){

        if(y >= 0) this.y = y;
    }

    @Override
    public int getY(){
        return y;
    }
}
