py_library(
    name = "some",
    srcs = glob(["some/**/*.py"]),
)

py_test(
    name = "test",
    srcs = ["test/test_something.py"],
    main = "test/test_something.py",
    deps = [":some"]
)