# 싱글톤 패턴

>싱글톤 패턴을 사용하는 이유:
>>
+ 최초 한번의 new 연산자를 통해서 고정된 메모리 영역을 사용, 추후 해당 객체에 접근할때 **"메모리 낭비를 방지"** 한다.
* **"데이터의 공유가 쉽다"**, 싱글톤 인스턴스가 전역으로 사용되는 인스턴스 이기 때문에 다른 클래스들이 접근하여 사용할 수 있다.  
이러한 이점은 동시성 문제가 발생할 수 있으니 유의해서 설계해야 한다

----------------------------------------
