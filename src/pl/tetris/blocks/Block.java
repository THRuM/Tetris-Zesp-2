package pl.tetris.blocks;

public interface Block {
    //Zwraca reprezentacje tablicową klocka
    Square[][] getShape();
    //Obrót klocka w prawo
    void rotateRight();
    //Obrót klocka w lewo
    void rotateLeft();
    //Przywraca poprzedni stan klocka
    void revertMove();

    int getX();
    void setX(int x);
    int getY();
    void setY(int y);
}
