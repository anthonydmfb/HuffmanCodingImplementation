import java.io.*;
import java.io.FileReader;
import java.util.Scanner;

    class treeNode{
        public String chStr;
        public int frequency;
        public String code;
        public treeNode left;
        public treeNode right;
        public treeNode next;

        treeNode(String chStr,int frequency, String code,treeNode left,treeNode right,treeNode next){
            this.chStr = chStr;
            this.frequency = frequency;
            this.code = code;
            this.left = left;
            this.right = right;
            this.next = next;
        }

        void printNode(treeNode node,BufferedWriter outFile1) throws IOException{
            String chr = node.chStr;
            if(node.chStr.contains("\n")){
                chr = "10";
            }
            else if(node.chStr.contains("\r")){
                chr = "13";
            }
            else if(node.chStr.contains(" ")){
                chr = "32";
            }

            String nodeInfo = "(" + chr + ", " + node.frequency + ", " + node.code + ", " + getNodeInfo(node.left) + ", " + getNodeInfo(node.right) + ", " + getNodeInfo(node.next) + ") -> ";
            outFile1.write(nodeInfo);
            
        }

        public String getNodeInfo(treeNode node){
            if(node == null){
                return "Null";
            }
            else{
                String chr = node.chStr;

                if(node.chStr.contains("\n")){
                    chr = "10";
                }
                else if(node.chStr.contains("\r")){
                    chr = "13";
                }
                else if(node.chStr.contains(" ")){
                    chr = "32";
                }
                    return chr;
             }
        }
    }

    class LLlist { 
        treeNode listHead;

        LLlist(){
            treeNode Dummy = new treeNode("Dummy",0," ",null,null,null);
            this.listHead = Dummy;
        }

        treeNode findSpot(treeNode listHead,treeNode newNode,BufferedWriter deBugFile) throws IOException{

            deBugFile.write("entering findSpot method\n");
            treeNode Spot = listHead;

            while(Spot.next != null && Spot.next.frequency < newNode.frequency){
                Spot = Spot.next;
                if(Spot.next!=null){
                    deBugFile.write("in findSpot: Spot.next frequency is: " + Spot.next.frequency +" and newNode.frequency is: " + newNode.frequency + "\n");
                }
            }
            deBugFile.write("leaving findSpot method\n");
            return Spot;
        }

        void insertOneNode(treeNode listHead,treeNode newNode,BufferedWriter deBugFile) throws IOException{
            treeNode Spot = findSpot(listHead, newNode, deBugFile);
            newNode.next = Spot.next;
            Spot.next = newNode;
        }

        void printList(LLlist list,BufferedWriter outFile1) throws IOException{
            treeNode Tmp = listHead;
            while(Tmp != null){
                Tmp.printNode(Tmp,outFile1);
                Tmp = Tmp.next;
            }
            outFile1.write("null\n");
        }
    }

    class binTree{
        treeNode Root;

        binTree(treeNode Root){
            this.Root = Root;
        }

        void preOrder(treeNode node,BufferedWriter outFile1) throws IOException{
            if(isLeaf(node)){
                node.printNode(node,outFile1);
            }
            else{
                node.printNode(node,outFile1);
                preOrder(node.left, outFile1);
                preOrder(node.right, outFile1);
            }
        }

        void inOrder(treeNode node,BufferedWriter outFile1) throws IOException{
            if(isLeaf(node)){
                node.printNode(node,outFile1);
            }
            else{
                inOrder(node.left, outFile1);
                node.printNode(node,outFile1);
                inOrder(node.right, outFile1);
            }
        }

        void postOrder(treeNode node,BufferedWriter outFile1) throws IOException{
            if(isLeaf(node)){
                node.printNode(node,outFile1);
            }
            else{
                postOrder(node.left, outFile1);
                postOrder(node.right, outFile1);
                node.printNode(node,outFile1);
            }
        }

        boolean isLeaf(treeNode node){
            if(node.left == null && node.right == null)
                return true;
            else 
                return false;
        }
    }

    class HuffManCode{
        int[] charCountAry = new int[256];
        String[] codeTable = new String[256];

        void computeCharCounts(BufferedReader inFile,int[] charCountAry, BufferedWriter deBugFile) throws IOException{
            int index;
            deBugFile.write("enteringComputerChar method\n");
            while (inFile.ready()) {
                index = inFile.read();
                charCountAry[index]++;
            }
        }

        void printCountAry(int[] charCountAry,BufferedWriter outFile1) throws IOException{
            outFile1.write("Index chStr count\n");
            for(int i = 0; i<charCountAry.length;i++){
                int count = charCountAry[i];
                if(count != 0)
                    outFile1.write(i + "    char" + i + " " + count + "\n");
            }
        }

        void constructHuffmanLLlist(LLlist list, treeNode listHead, BufferedWriter deBugFile) throws IOException{
            deBugFile.write("Entering constructHuffmanLList method\n");
            
            int index = 0;
            char chr;
            int frequency;
            while(index < 256){
                if(charCountAry[index] > 0){
                    chr = (char)index;
                    frequency = charCountAry[index];
                    String chStr = Character.toString(chr);
                    treeNode newNode = new treeNode(chStr, frequency, null, null, null, null);
            
                    list.insertOneNode(listHead,newNode,deBugFile);
                    deBugFile.write("printing list in constructHuffmanLLlist method\n");
                    list.printList(list, deBugFile);
                    
                }
                index++;
            }
            deBugFile.write("Leaving constructHuffmanLList method\n");
        }

        void constructHuffmanBinTree(LLlist list,treeNode listHead, BufferedWriter deBugFile) throws IOException{
            deBugFile.write("Entering constructHuffmanBinTree method\n");

            

            while(listHead.next.next != null){
                
                treeNode newNode = new treeNode(listHead.next.chStr + listHead.next.next.chStr,
                listHead.next.frequency + listHead.next.next.frequency,
            "", 
                listHead.next, 
                listHead.next.next, 
                null);
                
                treeNode Spot = list.findSpot(listHead, newNode, deBugFile);
                list.insertOneNode(Spot, newNode, deBugFile);

                listHead.next = listHead.next.next.next;
                deBugFile.write("Printing list in constructHuffmanBinTree\n");
                list.printList(list, deBugFile);
             }
             deBugFile.write("Leaving constructHuffmanBinTree method\n");
        }

        void constructCharCode(binTree tree, treeNode node,String code, String[] codeTable) throws IOException{
            
            if(tree.isLeaf(node)){
                node.code = code;
                char chr = node.chStr.charAt(0);
                int index = (int)chr;
                codeTable[index] = code;
            }
            else{
                constructCharCode(tree, node.left, code + "0", codeTable);
                constructCharCode(tree, node.right, code + "1", codeTable);
            }
        }

        void printCodeTable(String[] codeTable,BufferedWriter outFile1)throws IOException{
            outFile1.write("Index chStr Code\n");
            for(int i = 0; i<codeTable.length;i++){
                String code = codeTable[i];
                if(code != null)
                outFile1.write(i + "    char" + i + " " + code + "\n");
            }
        }

        void userInterface(BufferedReader FileIn, BufferedWriter FileOut,binTree tree, BufferedWriter deBugFile2)throws IOException{
            String nameOrg;
            String nameCompress;
            String nameDeCompress;
            char yesNo = 'x';
            Scanner input = new Scanner(System.in);
            while(Character.toUpperCase(yesNo) != 'N'){
                System.out.println("Would you like to encode a file? Y/N:");
                yesNo = input.next().charAt(0);
                if(Character.toUpperCase(yesNo) == 'N'){
                    input.close();
                    return;
                }
                System.out.println("Enter the file to be encoded without .txt");
                
                String fileName = input.next();
                nameOrg = fileName + ".txt";
                nameCompress = fileName + "_Compressed.txt";
                nameDeCompress = fileName + "_deCompressed.txt";
                
                BufferedReader nameOrgReader = new BufferedReader(new FileReader(nameOrg));
                BufferedWriter compressedFile = new BufferedWriter(new FileWriter(nameCompress));
                
                Encode(nameOrgReader,compressedFile,deBugFile2);
                nameOrgReader.close();
                compressedFile.close();

                BufferedReader nameCompressReader = new BufferedReader(new FileReader(nameCompress));
                BufferedWriter decompressedFile = new BufferedWriter(new FileWriter(nameDeCompress));
                Decode(nameCompressReader,decompressedFile,tree,deBugFile2);
                    
                
                
            }
            input.close();
        }

        void Encode(BufferedReader FileIn, BufferedWriter FileOut,BufferedWriter deBugFile2)throws IOException{
            char charIn;
            int index;
            String code;
            deBugFile2.write("Entering Encode method\n");
            

            while(FileIn.ready()){
                charIn = (char)FileIn.read();
                index = (int)charIn;
                code = codeTable[index];
                FileOut.write(code);
                deBugFile2.write("Index: " + index + " Code: " + code + " inside Encode ()\n");
            }
            deBugFile2.write("Leaving Encode Method\n");
        }

        void Decode(BufferedReader FileIn, BufferedWriter FileOut,binTree tree,BufferedWriter deBugFile2)throws IOException{
            deBugFile2.write("Entering Decode method\n");
            treeNode Spot = tree.Root;
            char oneBit;

            while(FileIn.ready()){
                if(tree.isLeaf(Spot)){
                    FileOut.write(Spot.chStr);
                    deBugFile2.write("Inside Decode method: " + Spot.chStr + " \n");
                    Spot = tree.Root;
                }
                oneBit = (char)FileIn.read();
                if(oneBit == '0'){
                    Spot = Spot.left;
                }
                else if(oneBit == '1'){
                    Spot = Spot.right;
                }
                else 
                    deBugFile2.write("Error: The compress file is corrupted!\n");

            }
            deBugFile2.write("Leaving Decode method\n");
            FileIn.close();
            FileOut.close();
        }
        
    }

public class HuffmanCode_Main {

    public static void main(String args[]) throws IOException {

        BufferedReader inFile = new BufferedReader(new FileReader(args[0]));
        BufferedWriter outFile1 = new BufferedWriter(new FileWriter(args[1]));
        BufferedWriter deBugFile = new BufferedWriter(new FileWriter(args[2]));
        BufferedWriter deBugFile2 = new BufferedWriter(new FileWriter(args[3]));

        HuffManCode huffMan = new HuffManCode();
        huffMan.computeCharCounts(inFile,huffMan.charCountAry,deBugFile);
        huffMan.printCountAry(huffMan.charCountAry,outFile1);

        LLlist list = new LLlist();
        
        huffMan.constructHuffmanLLlist(list, list.listHead, deBugFile);
        outFile1.write("Below is the ordered Huffman ordered Linked list\n");
        list.printList(list, outFile1);

        huffMan.constructHuffmanBinTree(list,list.listHead,deBugFile);
        binTree tree = new binTree(list.listHead.next);

        outFile1.write("Below is preOrder of the Huffman Binary Tree\n");
        tree.preOrder(tree.Root, outFile1);
        outFile1.write("\n");

        outFile1.write("Below is inOrder of the Huffman Binary Tree\n");
        tree.inOrder(tree.Root, outFile1);
        outFile1.write("\n");

        outFile1.write("Below is postOrder of the Huffman Binary Tree\n");
        tree.postOrder(tree.Root, outFile1);
        outFile1.write("\n");

        huffMan.constructCharCode(tree,tree.Root,"",huffMan.codeTable); 
       
        huffMan.printCodeTable(huffMan.codeTable, outFile1);
        huffMan.userInterface(inFile, outFile1,tree, deBugFile2);



        inFile.close();
        outFile1.close();
        deBugFile.close();
        deBugFile2.close();
    }
}
