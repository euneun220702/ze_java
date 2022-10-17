 /*
서은경
*/
 System.out.print("결제 금액을 입력해 주세요.(금액): " );
    int input = s.nextInt();

    int cash = 10;
    int back = input/cash;
    if(input > 1){
        System.out.print("결제 금액은 "+input+"원이고,");
    }
    if (back <= 99) {
        System.out.println(" 캐시백은 0원 입니다.");
    }else if(back >= 100 && back <= 300){
        BigDecimal dc = new BigDecimal(back);
        dc = dc.setScale(-2,BigDecimal.ROUND_DOWN);
        System.out.println(" 캐시백은 "+dc.intValue()+"원 입니다.");
    }else if (back > 300){
        System.out.println(" 캐시백은 300원 입니다.");

    }

}
