package Architecture_op.HW_6.facade;

//Класс, который будет являться фасадом, т.е. объединять функциональность всех классов(запускает методы всех классов в одном методе)
public class FileSystemFacade {
    private FileSearchSystem searchSystem;
    private DownloadFile downloadFile;
    private OutputDisplay outputDisplay;

    public FileSystemFacade() {
        this.searchSystem =  new FileSearchSystem();
        this.downloadFile = new  DownloadFile();
        this.outputDisplay = new OutputDisplay();
    }

    /**
     * Метод getFile запускает методы классов FileSearchSystem, DownloadFile и OutputDisplay
     */
    public void getFile(){
        searchSystem.search();
        downloadFile.load();
        outputDisplay.output();
    }
}
