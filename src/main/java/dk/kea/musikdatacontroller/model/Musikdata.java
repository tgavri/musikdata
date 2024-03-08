package dk.kea.musikdatacontroller.model;

public class Musikdata {
    int id;
    String band;
    String songname;
    String album;
    int releasedate;

    public Musikdata(int id, String band, String songname, String album, int releasedate) {
        this.id = id;
        this.band = band;
        this.songname = songname;
        this.album = album;
        this.releasedate = releasedate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public void setReleasedate(int releasedate) {
        this.releasedate = releasedate;
    }

    public void setSongname(String songname) {
        this.songname = songname;
    }

    public int getId() {
        return id;
    }

    public int getReleasedate() {
        return releasedate;
    }

    public String getAlbum() {
        return album;
    }

    public String getBand() {
        return band;
    }

    public String getSongname() {
        return songname;
    }
}
