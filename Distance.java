public class Distance {
    public static float Levenshtein(String sourceStr, String checkedStr){
        float result;
        if(sourceStr==null||checkedStr==null) {
            return 0;
        }else {
            int[][] distanceMatrix = new int[checkedStr.length() + 1][sourceStr.length() + 1];
            for (int i = 0; i <= sourceStr.length(); i++) {
                distanceMatrix[0][i] = i;
            }
            for (int i = 0; i <= checkedStr.length(); i++) {
                distanceMatrix[i][0] = i;
            }
            for(int y=1;y<=checkedStr.length();y++){
                for(int x=1;x<=sourceStr.length();x++){
                    if(distanceMatrix[y-1][x-1]<=distanceMatrix[y-1][x]&&distanceMatrix[y-1][x-1]<=distanceMatrix[y][x-1]){
                        if(checkedStr.charAt(y-1)==sourceStr.charAt(x-1)){

                            distanceMatrix[y][x]=distanceMatrix[y-1][x-1];
                        }else{
                            distanceMatrix[y][x]=distanceMatrix[y-1][x-1]+1;
                        }
                    }else{
                        distanceMatrix[y][x]=distanceMatrix[y-1][x]<distanceMatrix[y][x-1]?distanceMatrix[y-1][x]+1:distanceMatrix[y][x-1]+1;
                    }
                    System.out.print("  "+distanceMatrix[y][x]);
                }
                System.out.println();
            }
            result=(float) distanceMatrix[checkedStr.length()][sourceStr.length()];
            float max=checkedStr.length()>sourceStr.length()?checkedStr.length():sourceStr.length();
            return 1-result/max;
        }
    }
}