- Q. `java.lang.Object` クラスは `clone` メソッドを持っているが、
  `java.lang.Object` クラスは `java.lang.Cloneable` インタフェースを実
  装しているか

- A. していない
  - もし実装していたら、どのクラスのインスタンスで `clone` メソッドを
    呼び出しても、`CloneNotSupportedException` 例外が投げられなくなっ
    てしまう
