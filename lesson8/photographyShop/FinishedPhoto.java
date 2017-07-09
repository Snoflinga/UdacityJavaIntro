// Optional
// Does your design use FinishedPhoto objects?
// If so, fill in this class with your code.

public class FinishedPhoto
{
    private String author;
    private Picture picture;

    public FinishedPhoto(String author, String fileName){
        this.author = author;
        this.picture = new Picture("photographyShop/" + fileName);
    }

    public Picture getPicture(){
        return this.picture;
    }

    public String getAuthor(){
        return this.author;
    }
}
