- Q. なぜ `PrintBanner` クラスのインスタンスを作るとき、なぜ `PrintBanner` 型の変数に代入しないのか?

```
Print p = new PrintBanner("Hello");
```

```
PrintBanner p = new PrintBanner("Hello");
```

- A. 「`Print` インタフェースのメソッドだけを用いる」ということを強調したかったから
