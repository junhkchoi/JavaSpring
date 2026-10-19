package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    
    public void call() {
        publicValue = 1;
        protectedValue = 3; // 다른 패키지 상속 관계 or 같은 패키지
        // defaultValue 다른 패키지 접근 불가 
        // privateValue 접근 불가

        publicMethod();
        protectedMethod();
        // defaultMethod();
        // privateMethod();

        printParent();
    }
}
