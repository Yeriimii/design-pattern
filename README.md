# 목차
## Chapter01 - 전략 패턴(strategy pattern)
전략 패턴(strategy pattern)은 알고리즘군을 정의하고 캡슐화해서 각각의 알고리즘군을 수정해서 쓸 수 있게 해준다.  
전략 패턴을 사용하면 클라이언트로부터 알고리즘을 분리해서 독립적으로 변경할 수 있다.  
> 1. 디자인 원칙: 애플리케이션에서 달라지는 부분을 찾아내고, 달라지지 않는 부분과 분리한다. (바뀌는 부분은 캡슐화->유연성 향상)
> 2. 디자인 원칙: 구현보다 인터페이스에 맞춰서 프로그래밍한다. (위임할 객체에게 맡기면 구체적으로 구현하지 않아도 된다.)
> 3. 디자인 원칙: 상속보다는 구성을 활용한다. (행동을 상속받는 대신 올바른 객체로 *구성*되게 한다.)  
  
고민할 거리: 상속에는 상속 나름대로 문제가 있으며, 상속 외에도 재사용을 이룰 수 있는 여러 방법들이 있다.  
훌륭한 객체지향 디자인에는 재사용성, 확장성, 관리용이성이 있다.  
대부분의 패턴과 원칙은 소프트웨어 변경 문제와 연관되어 있다.  
