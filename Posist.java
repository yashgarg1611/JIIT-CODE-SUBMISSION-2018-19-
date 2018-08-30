package posist;

import java.util.ArrayList;
import java.util.Date;
import java.lang.*;
import java.util.Date;
import java.sql.Timestamp;

public class Posist
{
   class Node
   {
       
       String Hashvalue;
       String refNodeID;
       Date timestamp;
       int data;
       int nodeNumber;
       String NodeID;
        String childRefNodeID;
       String genesisRefNode;
      
       ArrayList<Node> link=new ArrayList();
       int Nodenum;
       public Node(Date timestamp,int data,int node,String nodeID, String refNodeID, String childRefID,String genesisRefNode)
       {
           this.refNodeID=refNodeID;
           this.nodeNumber=node;
           this.childRefNodeID=childRefID;
            this.NodeID=nodeID;
           this.data=data;
           this.timestamp=timestamp;
           this.genesisRefNode=genesisRefNode;
           String h=data+node+nodeID+refNodeID+childRefID+genesisRefNode+timestamp;
           this.Hashvalue=this.getHashValue(h);
          
       }
      
       public String getHashval(String s)
       {
           int ans=s.hashCode();
           String k=ans+"";
           return k;
       }
      
       public void createNode(Node A,Date timestamp,int data,int node,String nodeID, String refNodeID, String childRefID,String genesisRefNode)
       {
           Nodenum++;
           if(A==null)
           {
               genesis=new Node(timestamp,data,node,nodeID,refNodeID,childRefID,genesisRefNode);
           }   
           Node temp=new Node(timestamp,data,node,nodeID,refNodeID,childRefID,genesisRefNode);
           String pid=refNodeID;
           Node parent=findparent(pid);
           int i=0;
           int n=this.link.size();
           int sum=0;
           while(i<n)
           {
               Node n1=this.link.get(i);
               sum=sum+n1.data;
           }
           if(this.data>(parent.data-sum))
           {
              
           }
       }

        private String getHashVal(String h) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private Node findparent(String pid) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
   }
   Node genesis;
    public static void main(String[] args) {
        // TODO code application logic here
        Posist pos=new Posist();
        Date date= new Date();
long time = date. getTime();
System. out. println("Time in Milliseconds: " + time);
Timestamp ts = new Timestamp(time);
System. out. println("Current Time Stamp: " + ts);
        
    }
   
}

