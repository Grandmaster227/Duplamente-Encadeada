public class Double {
    protected Node top; 
    protected Node base;


    public Double() {
        this.top = null;
        this.base = null;
    }


    public void addComeco(int dado) {
        Node n = new Node(dado);
        if (top == null) {
            top = base = n;

        } else {
            n.next = top;
            top.prev = n;
            top = n;
        }
    }

    public void addFinal(int dado) {
        Node n = new Node(dado);
        if (top == null) {
            top = base = n;
        } else {
            base.next = n;
            n.prev = base;
            base = n;
        }
    }

    public void deleteComeco() {
        if (top == null) {
            System.out.println("Lista vazia");
            return;
        }
        if (top == base) {
            top = base = null;
        } else {
            top = top.next;
            top.prev = null;
        }
    }

    public void deleteFim() {
        if (base == null) {
            System.out.println("Lista vazia");
            return;
        }
        if (base == top) {
            top = base = null;
        } else {
            base = base.prev;
            base.next = null;
        }
    }


        public void printando() {
            Node nod = base;
            while (nod != null) {
                System.out.print(nod.dado + " ");
                nod = nod.prev;
            }
            System.out.println();
        }
    }
