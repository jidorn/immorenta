public class Node {

    Node left,right;
    int value;

    public Node find (int v){
        int root = this.value;
        if (v==root)return this;
        if (v<root&&left!=null)
            left.find(v);
        if (v>root&&right!=null)
            right.find(v);
        return null;
    }
}
