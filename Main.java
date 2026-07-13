
public class Main {
    public static void main(String[] args){

        Product p1 = new Product();
        p1.name = "사과";
        p1.price = 1000;
        p1.stock = 5;

        Product p2 = new Product();
        p2.name = "바나나";
        p2.price = 500;
        p2.stock = 3;

        p1.sell(3);
        p1.sell(3);
        p1.restock(10);

        p2.sell(1);

        System.out.println(p1.name+" 재고 총 가치: "+p1.stockValue()+"원");
        System.out.println(p2.name+" 재고 총 가치: "+p2.stockValue()+"원");


    }
}

class Product{
    String name; //상품명
    int price; //가격(원)
    int stock; //현재 재고 수량

    public void restock(int quantity){
        stock += quantity;
        System.out.println(name+""+quantity+"개 입고 완료, 현재 재고: "+stock);
    } //입고

    public void sell(int quantity){
        if(stock >= quantity){
            stock -= quantity;
            System.out.println(name+" "+quantity+"개 판매 성공, 남은 재고: "+stock);
        }
        else{
            System.out.println(name+" 판매 실패, 재고 부족 (현재 "+stock+"개)");
        }
        //출고(판매)
    }

    public int stockValue() {
        return price * stock;
    } //재고 총 가치
}
