This project successfully compiles and tests a scala dl4j project with the cuda-9.2 platform.  It was created because of the error described by the readme below.



========================= original error

This project successfully compiles (after removing `.ivy2/cache`).  
I have added nvcc to my path and also included it in both `src/main/resources` and `src/test/resources`:

```
> nvcc --version
nvcc: NVIDIA (R) Cuda compiler driver
Copyright (c) 2005-2018 NVIDIA Corporation
Built on Tue_Jun_12_23:07:04_CDT_2018
Cuda compilation tools, release 9.2, V9.2.148
```

But when I run `sbt test` I get the below error:

```
[info] com.simplecuda.SimpleCudaTest *** ABORTED ***
[info]   java.lang.ExceptionInInitializerError:
[info]   at com.simplecuda.SimpleCudaTest$$anonfun$1.apply$mcV$sp(SimpleCudaTest.scala:10)
[info]   at com.simplecuda.SimpleCudaTest$$anonfun$1.apply(SimpleCudaTest.scala:9)
[info]   at com.simplecuda.SimpleCudaTest$$anonfun$1.apply(SimpleCudaTest.scala:9)
[info]   at org.scalatest.OutcomeOf$class.outcomeOf(OutcomeOf.scala:85)
[info]   at org.scalatest.OutcomeOf$.outcomeOf(OutcomeOf.scala:104)
[info]   at org.scalatest.Transformer.apply(Transformer.scala:22)
[info]   at org.scalatest.Transformer.apply(Transformer.scala:20)
[info]   at org.scalatest.FlatSpecLike$$anon$1.apply(FlatSpecLike.scala:1682)
[info]   at org.scalatest.TestSuite$class.withFixture(TestSuite.scala:196)
[info]   at org.scalatest.FlatSpec.withFixture(FlatSpec.scala:1685)
[info]   ...
[info]   Cause: java.lang.RuntimeException: org.nd4j.linalg.factory.Nd4jBackend$NoAvailableBackendException: Please ensure that you have an nd4j backend on your classpath. Please see: http://nd4j.org/getstarted.html
[info]   at org.nd4j.linalg.factory.Nd4j.initContext(Nd4j.java:5449)
[info]   at org.nd4j.linalg.factory.Nd4j.<clinit>(Nd4j.java:213)
[info]   at com.simplecuda.SimpleCudaTest$$anonfun$1.apply$mcV$sp(SimpleCudaTest.scala:10)
[info]   at com.simplecuda.SimpleCudaTest$$anonfun$1.apply(SimpleCudaTest.scala:9)
[info]   at com.simplecuda.SimpleCudaTest$$anonfun$1.apply(SimpleCudaTest.scala:9)
[info]   at org.scalatest.OutcomeOf$class.outcomeOf(OutcomeOf.scala:85)
[info]   at org.scalatest.OutcomeOf$.outcomeOf(OutcomeOf.scala:104)
[info]   at org.scalatest.Transformer.apply(Transformer.scala:22)
[info]   at org.scalatest.Transformer.apply(Transformer.scala:20)
[info]   at org.scalatest.FlatSpecLike$$anon$1.apply(FlatSpecLike.scala:1682)
[info]   ...
[info]   Cause: org.nd4j.linalg.factory.Nd4jBackend$NoAvailableBackendException: Please ensure that you have an nd4j backend on your classpath. Please see: http://nd4j.org/getstarted.html
[info]   at org.nd4j.linalg.factory.Nd4jBackend.load(Nd4jBackend.java:213)
[info]   at org.nd4j.linalg.factory.Nd4j.initContext(Nd4j.java:5446)
[info]   at org.nd4j.linalg.factory.Nd4j.<clinit>(Nd4j.java:213)
[info]   at com.simplecuda.SimpleCudaTest$$anonfun$1.apply$mcV$sp(SimpleCudaTest.scala:10)
[info]   at com.simplecuda.SimpleCudaTest$$anonfun$1.apply(SimpleCudaTest.scala:9)
[info]   at com.simplecuda.SimpleCudaTest$$anonfun$1.apply(SimpleCudaTest.scala:9)
[info]   at org.scalatest.OutcomeOf$class.outcomeOf(OutcomeOf.scala:85)
[info]   at org.scalatest.OutcomeOf$.outcomeOf(OutcomeOf.scala:104)
[info]   at org.scalatest.Transformer.apply(Transformer.scala:22)
[info]   at org.scalatest.Transformer.apply(Transformer.scala:20)

```
