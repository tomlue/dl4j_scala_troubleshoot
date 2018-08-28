Run the following to get no-backend error

1. sbt assembly
2. java -jar ./target/scala-2.11/simplecuda-assembly-1.0.jar

Resulting exception is:

```
Exception in thread "main" java.lang.ExceptionInInitializerError
	at org.datavec.api.util.ndarray.RecordConverter.toMinibatchArray(RecordConverter.java:197)
	at org.deeplearning4j.datasets.datavec.RecordReaderMultiDataSetIterator.next(RecordReaderMultiDataSetIterator.java:159)
	at org.deeplearning4j.datasets.datavec.RecordReaderDataSetIterator.next(RecordReaderDataSetIterator.java:364)
	at org.deeplearning4j.datasets.datavec.RecordReaderDataSetIterator.next(RecordReaderDataSetIterator.java:439)
	at simplecuda.main$.delayedEndpoint$simplecuda$main$1(main.scala:37)
	at simplecuda.main$delayedInit$body.apply(main.scala:27)
	at scala.Function0$class.apply$mcV$sp(Function0.scala:34)
	at scala.runtime.AbstractFunction0.apply$mcV$sp(AbstractFunction0.scala:12)
	at scala.App$$anonfun$main$1.apply(App.scala:76)
	at scala.App$$anonfun$main$1.apply(App.scala:76)
	at scala.collection.immutable.List.foreach(List.scala:381)
	at scala.collection.generic.TraversableForwarder$class.foreach(TraversableForwarder.scala:35)
	at scala.App$class.main(App.scala:76)
	at simplecuda.main$.main(main.scala:27)
	at simplecuda.main.main(main.scala)
Caused by: java.lang.RuntimeException: org.nd4j.linalg.factory.Nd4jBackend$NoAvailableBackendException: Please ensure that you have an nd4j backend on your classpath. Please see: http://nd4j.org/getstarted.html
	at org.nd4j.linalg.factory.Nd4j.initContext(Nd4j.java:5449)
	at org.nd4j.linalg.factory.Nd4j.<clinit>(Nd4j.java:213)
	... 15 more
Caused by: org.nd4j.linalg.factory.Nd4jBackend$NoAvailableBackendException: Please ensure that you have an nd4j backend on your classpath. Please see: http://nd4j.org/getstarted.html
	at org.nd4j.linalg.factory.Nd4jBackend.load(Nd4jBackend.java:213)
	at org.nd4j.linalg.factory.Nd4j.initContext(Nd4j.java:5446)
```
