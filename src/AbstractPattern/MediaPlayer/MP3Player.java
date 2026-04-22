package AbstractPattern.MediaPlayer;

class MP3Player implements MediaPlayer{
    public void play(String file) {
        System.out.println("Playing Mp3 file: " + file);   
    } 
}
