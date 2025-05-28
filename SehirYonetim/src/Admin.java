class Admin {
    private String username;
    private String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String varlikEkle() {
        return "Yeni varlik eklendi.";
    }

    public String varlikGuncelle() {
        return "Varlik guncellendi.";
    }

    public String sorunBildir() {
        return "Sorun bildirildi.";
    }

    public String sorunCoz() {
        return "Sorun cozuldu.";
    }
}