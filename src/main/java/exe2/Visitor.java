package exe2;
public interface Visitor {
    void visit(Asset asset);
    void visit(Group group);
    void visit(User user);
}
