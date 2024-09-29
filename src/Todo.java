import com.google.gson.annotations.SerializedName;

public class Todo {

    @SerializedName("userId")
    private int id;

    @SerializedName("id")
    private int second_id;

    @SerializedName("title")
    private String name;

    @SerializedName("completed")
    private boolean status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSecond_id() {
        return second_id;
    }

    public void setSecond_id(int second_id) {
        this.second_id = second_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


}
