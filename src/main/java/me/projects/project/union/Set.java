package me.projects.project.union;

/**
 *
 * @author hrachyay
 */
public class Set {
    private boolean adjacencyMatrix[][] ;
    private int size;
    private int componentsMap[] = null;

    public Set(int size) {
        this.size = size;
        adjacencyMatrix = new boolean[size][size];
    }
    
    private void checkIndexAndThrowException(int ... indexes){
        for (int i : indexes) {
            if (i < 0 || i >= size) {
                throw new IllegalArgumentException("index should be positive integer less than " + String.valueOf(size));
            }
        }
    }
    
    public boolean isAdjacent(int i, int j){
        checkIndexAndThrowException(i, j);
        
        if (i == j) {
            return true;
        }
        
        return adjacencyMatrix[i][j];
    }
    
    public void connect(int i, int j) {
        checkIndexAndThrowException(i, j);
        adjacencyMatrix[i][j] = true;
    }
    
    private void calculateComponentsMap(){
        componentsMap = new int[size];
        for (int k = 0; k < size; k++) {
            componentsMap[k] = k;
        }
        
        for (int k = 0; k < size; k++) {
            for (int l = k+1; l < size; l++) {
                if (componentsMap[l] == l && isAdjacent(k, l)) {
                    componentsMap[l] = componentsMap[k];
                }
            }
        }
    }
    
    public boolean areConnected(int i, int j){
        checkIndexAndThrowException(i, j);
        if (componentsMap == null) {
            calculateComponentsMap();
        }
        
        return componentsMap[i] == componentsMap[j];
    }
}
