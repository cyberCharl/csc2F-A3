JAVAC=/usr/bin/javac
.SUFFIXES: .java .class
SRCDIR=src
BINDIR=bin
$(BINDIR)/%.class:$(SRCDIR)/%.java
$(JAVAC) -d $(BINDIR)/ -cp $(BINDIR) $<
CLASSES=HashFunction.class HashTable.class TestHashTable.class
CLASS_FILES=$(CLASSES:%.class=$(BINDIR)/%.class)
default: $(CLASS_FILES)
clean:
rm $(BINDIR)/*.class
run: $(CLASS_FILES)
java -cp bin TestHashTable
