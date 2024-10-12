package assignment_7_Online_Learning_Platform;

public class ProxyVideoLecture implements VideoLecture {
    private String videoTitle;
    private RealVideoLecture realVideoLecture;

    public ProxyVideoLecture(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    @Override
    public void getInfo() {
        System.out.println("Video lecture title: " + videoTitle);
    }

    @Override
    public void play() {
        if (realVideoLecture == null) {
            realVideoLecture = new RealVideoLecture(videoTitle);
        }
        realVideoLecture.play();
    }
}
