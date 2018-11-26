public class SkyView {
    private double[][] view;
    public SkyView(int numrows, int numcols, double[] scanned){
        view = new double[numrows][numcols];
        int count = 0;
        for(int i = 0;i<numrows;i++){
            if(i%2 == 0){
                for(int j = 0;j<numcols;j++){
                    view[i][j] = scanned[count];
                    count++;
                }
            }
            if(i%2 == 1){
                for(int k = numcols;k>=0;k++){
                    view[i][k] = scanned[count];
                    count++;
                }
            }
        }
    }
    public double getAverage(int startRow, int endRow, int startCol, int endCol){
        double total = 0; int count = 0;
        for(int i = startRow;i<endRow;i++){
            for(int j = startCol;j<endCol;j++){
                total += view[i][j];
                count++;
            }
        }
        return total/count;
    }
}
