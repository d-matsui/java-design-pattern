- Q. IDCard クラスのコンストラクは public になっていないが、これは何を表しているか

```
public class IDCard extends Product {
    ...
    IDCard(String owner) {
        ...
        this.owner = owner;
    }
    ...
}
```


- A. IDCard のインスタンスは、idcardパッケージ外から new を使って生成できないことを表している
  - IDCard のインスタンスを生成するときは、必ず IDCardFactory を経由しなければならないことになる
