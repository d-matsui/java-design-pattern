- Q. コンストラクタで必ず製品の名前を引数として与えることを強制するためにコードを以下のようにした。これがコンパイルエラーとなるのはなぜか

```
public abstract class Product {
    public abstract Product(String name);
    public abstract void use();
}
```

- A. Java では abstract なコンストラクタを定義することができないから
  - この場合、コンストラクタで製品の名前をつけるのではなく、名前をつけるためのメソッドを別途宣言する必要がある
