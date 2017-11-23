java_import(
    name = "jar-deps",
    jars = glob(["lib/*.jar"]),
)

java_binary(
    name = "KaptchaGenerator",
    srcs = glob([
        "src/main/java/com/google/code/kaptcha/*.java",
        "src/main/java/com/google/code/kaptcha/impl/*.java",
        "src/main/java/com/google/code/kaptcha/text/*.java",
        "src/main/java/com/google/code/kaptcha/text/impl/*.java",
        "src/main/java/com/google/code/kaptcha/util/*.java",
        "src/main/java/ro/tuscale/kaptcha/*.java"]),
    deps = [":jar-deps"],
    main_class = "ro.tuscale.kaptcha.KaptchaRunner",
)
