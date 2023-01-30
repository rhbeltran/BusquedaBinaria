public class Graph {
    private Node[] nodeArr;
public Graph(){
    final int size =6;
    this.nodeArr =new Node[size];
        for (int i=1; i< size; i++){
            nodeArr[i] =new Node();
            nodeArr[i].setVertex(i);
            nodeArr[i].setNext(null);
    
        }
    }
 
public void add (int i, int data){
    Node newNode = new Node();
    newNode.setVertex(data);
    Node p = nodeArr[i].getNext();
    if(nodeArr[i]==null){
        nodeArr[i].setNext(newNode);
    }else {
        Node q=null;
        while(p!=null){
            q=p;
            p=p.getNext();
        }
        q.setNext(newNode);
    }
}   

public void print(){
    for(int i=1; i < nodeArr.length;i++){
        
    }

}

}
