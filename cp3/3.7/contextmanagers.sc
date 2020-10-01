def withFileWriter(file: String)(writerFunction: java.io.BufferedWriter => Unit) = {
    val writeTo = java.nio.file.Files.newBufferedWriter(java.nio.file.Paths.get(file))
    try writerFunction(writeTo)
    finally writeTo.close()
}

def withFileReader(file: String)(readerFunction: java.io.BufferedReader => String) = {
    val readFrom = java.nio.file.Files.newBufferedReader(java.nio.file.Paths.get(file))
    try readerFunction(readFrom)
    finally readFrom.close()
}
