package exe2;

public class Group implements ObjectsToExport {
    int id;
    int size;

    @Override
    public void accept(Visitor visitor) {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
