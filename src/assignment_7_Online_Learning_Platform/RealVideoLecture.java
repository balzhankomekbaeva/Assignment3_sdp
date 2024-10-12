package assignment_7_Online_Learning_Platform;

public class RealVideoLecture implements VideoLecture {
    private String videoTitle;

    public RealVideoLecture(String videoTitle) {
        this.videoTitle = videoTitle;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading video lecture: " + videoTitle);
    }

    @Override
    public void getInfo() {
        System.out.println("Video lecture title: " + videoTitle);
    }

    @Override
    public void play() {
        System.out.println("Playing video lecture: " + videoTitle);
    }
}

