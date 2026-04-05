package com.explorestack.protobuf;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.inmobi.commons.core.configs.AdConfig;
import com.moloco.sdk.BKC.KerkSviMAy;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {
    static final int CONCATENATE_BY_COPY_SIZE = 128;
    public static final ByteString EMPTY = new LiteralByteString(x7.f22883c);
    static final int MAX_READ_FROM_CHUNK_SIZE = 8192;
    static final int MIN_READ_FROM_CHUNK_SIZE = 256;
    private static final int UNSIGNED_BYTE_MASK = 255;
    private static final Comparator<ByteString> UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    private static final ByteArrayCopier byteArrayCopier;
    private int hash = 0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class AbstractByteIterator implements ByteIterator {
        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ArraysByteArrayCopier implements ByteArrayCopier {
        private ArraysByteArrayCopier() {
        }

        @Override // com.explorestack.protobuf.ByteString.ByteArrayCopier
        public byte[] copyFrom(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class BoundedByteString extends LiteralByteString {
        private static final long serialVersionUID = 1;
        private final int bytesLength;
        private final int bytesOffset;

        public BoundedByteString(byte[] bArr, int i10, int i11) {
            super(bArr);
            ByteString.checkRange(i10, i10 + i11, bArr.length);
            this.bytesOffset = i10;
            this.bytesLength = i11;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.explorestack.protobuf.ByteString.LiteralByteString, com.explorestack.protobuf.ByteString
        public byte byteAt(int i10) {
            ByteString.checkIndex(i10, size());
            return this.bytes[this.bytesOffset + i10];
        }

        @Override // com.explorestack.protobuf.ByteString.LiteralByteString, com.explorestack.protobuf.ByteString
        public void copyToInternal(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.bytes, getOffsetIntoBytes() + i10, bArr, i11, i12);
        }

        @Override // com.explorestack.protobuf.ByteString.LiteralByteString
        public int getOffsetIntoBytes() {
            return this.bytesOffset;
        }

        @Override // com.explorestack.protobuf.ByteString.LiteralByteString, com.explorestack.protobuf.ByteString
        public byte internalByteAt(int i10) {
            return this.bytes[this.bytesOffset + i10];
        }

        @Override // com.explorestack.protobuf.ByteString.LiteralByteString, com.explorestack.protobuf.ByteString
        public int size() {
            return this.bytesLength;
        }

        public Object writeReplace() {
            return ByteString.wrap(toByteArray());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface ByteArrayCopier {
        byte[] copyFrom(byte[] bArr, int i10, int i11);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface ByteIterator extends Iterator<Byte> {
        byte nextByte();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class CodedBuilder {
        private final byte[] buffer;
        private final h0 output;

        public ByteString build() {
            this.output.checkNoSpaceLeft();
            return new LiteralByteString(this.buffer);
        }

        public h0 getCodedOutput() {
            return this.output;
        }

        private CodedBuilder(int i10) {
            byte[] bArr = new byte[i10];
            this.buffer = bArr;
            this.output = h0.newInstance(bArr);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class LeafByteString extends ByteString {
        public abstract boolean equalsRange(ByteString byteString, int i10, int i11);

        @Override // com.explorestack.protobuf.ByteString
        public final int getTreeDepth() {
            return 0;
        }

        @Override // com.explorestack.protobuf.ByteString
        public final boolean isBalanced() {
            return true;
        }

        @Override // com.explorestack.protobuf.ByteString, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator2();
        }

        @Override // com.explorestack.protobuf.ByteString
        public void writeToReverse(s sVar) throws IOException {
            writeTo(sVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class LiteralByteString extends LeafByteString {
        private static final long serialVersionUID = 1;
        protected final byte[] bytes;

        public LiteralByteString(byte[] bArr) {
            bArr.getClass();
            this.bytes = bArr;
        }

        @Override // com.explorestack.protobuf.ByteString
        public final ByteBuffer asReadOnlyByteBuffer() {
            return ByteBuffer.wrap(this.bytes, getOffsetIntoBytes(), size()).asReadOnlyBuffer();
        }

        @Override // com.explorestack.protobuf.ByteString
        public final List<ByteBuffer> asReadOnlyByteBufferList() {
            return Collections.singletonList(asReadOnlyByteBuffer());
        }

        @Override // com.explorestack.protobuf.ByteString
        public byte byteAt(int i10) {
            return this.bytes[i10];
        }

        @Override // com.explorestack.protobuf.ByteString
        public final void copyTo(ByteBuffer byteBuffer) {
            byteBuffer.put(this.bytes, getOffsetIntoBytes(), size());
        }

        @Override // com.explorestack.protobuf.ByteString
        public void copyToInternal(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.bytes, i10, bArr, i11, i12);
        }

        @Override // com.explorestack.protobuf.ByteString
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof LiteralByteString)) {
                return obj.equals(this);
            }
            LiteralByteString literalByteString = (LiteralByteString) obj;
            int iPeekCachedHashCode = peekCachedHashCode();
            int iPeekCachedHashCode2 = literalByteString.peekCachedHashCode();
            if (iPeekCachedHashCode == 0 || iPeekCachedHashCode2 == 0 || iPeekCachedHashCode == iPeekCachedHashCode2) {
                return equalsRange(literalByteString, 0, size());
            }
            return false;
        }

        @Override // com.explorestack.protobuf.ByteString.LeafByteString
        public final boolean equalsRange(ByteString byteString, int i10, int i11) {
            if (i11 > byteString.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > byteString.size()) {
                StringBuilder sbF = w0.i.f(i10, i11, "Ran off end of other: ", ", ", ", ");
                sbF.append(byteString.size());
                throw new IllegalArgumentException(sbF.toString());
            }
            if (!(byteString instanceof LiteralByteString)) {
                return byteString.substring(i10, i12).equals(substring(0, i11));
            }
            LiteralByteString literalByteString = (LiteralByteString) byteString;
            byte[] bArr = this.bytes;
            byte[] bArr2 = literalByteString.bytes;
            int offsetIntoBytes = getOffsetIntoBytes() + i11;
            int offsetIntoBytes2 = getOffsetIntoBytes();
            int offsetIntoBytes3 = literalByteString.getOffsetIntoBytes() + i10;
            while (offsetIntoBytes2 < offsetIntoBytes) {
                if (bArr[offsetIntoBytes2] != bArr2[offsetIntoBytes3]) {
                    return false;
                }
                offsetIntoBytes2++;
                offsetIntoBytes3++;
            }
            return true;
        }

        public int getOffsetIntoBytes() {
            return 0;
        }

        @Override // com.explorestack.protobuf.ByteString
        public byte internalByteAt(int i10) {
            return this.bytes[i10];
        }

        @Override // com.explorestack.protobuf.ByteString
        public final boolean isValidUtf8() {
            int offsetIntoBytes = getOffsetIntoBytes();
            return vc.isValidUtf8(this.bytes, offsetIntoBytes, size() + offsetIntoBytes);
        }

        @Override // com.explorestack.protobuf.ByteString
        public final y newCodedInput() {
            return y.a(this.bytes, getOffsetIntoBytes(), size(), true);
        }

        @Override // com.explorestack.protobuf.ByteString
        public final InputStream newInput() {
            return new ByteArrayInputStream(this.bytes, getOffsetIntoBytes(), size());
        }

        @Override // com.explorestack.protobuf.ByteString
        public final int partialHash(int i10, int i11, int i12) {
            return x7.c(i10, this.bytes, getOffsetIntoBytes() + i11, i12);
        }

        @Override // com.explorestack.protobuf.ByteString
        public final int partialIsValidUtf8(int i10, int i11, int i12) {
            int offsetIntoBytes = getOffsetIntoBytes() + i11;
            return vc.partialIsValidUtf8(i10, this.bytes, offsetIntoBytes, i12 + offsetIntoBytes);
        }

        @Override // com.explorestack.protobuf.ByteString
        public int size() {
            return this.bytes.length;
        }

        @Override // com.explorestack.protobuf.ByteString
        public final ByteString substring(int i10, int i11) {
            int iCheckRange = ByteString.checkRange(i10, i11, size());
            return iCheckRange == 0 ? ByteString.EMPTY : new BoundedByteString(this.bytes, getOffsetIntoBytes() + i10, iCheckRange);
        }

        @Override // com.explorestack.protobuf.ByteString
        public final String toStringInternal(Charset charset) {
            return new String(this.bytes, getOffsetIntoBytes(), size(), charset);
        }

        @Override // com.explorestack.protobuf.ByteString
        public final void writeTo(OutputStream outputStream) throws IOException {
            outputStream.write(toByteArray());
        }

        @Override // com.explorestack.protobuf.ByteString
        public final void writeToInternal(OutputStream outputStream, int i10, int i11) throws IOException {
            outputStream.write(this.bytes, getOffsetIntoBytes() + i10, i11);
        }

        @Override // com.explorestack.protobuf.ByteString
        public final void writeTo(s sVar) throws IOException {
            sVar.writeLazy(this.bytes, getOffsetIntoBytes(), size());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class SystemByteArrayCopier implements ByteArrayCopier {
        private SystemByteArrayCopier() {
        }

        @Override // com.explorestack.protobuf.ByteString.ByteArrayCopier
        public byte[] copyFrom(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    static {
        byteArrayCopier = f.a() ? new SystemByteArrayCopier() : new ArraysByteArrayCopier();
        UNSIGNED_LEXICOGRAPHICAL_COMPARATOR = new Comparator<ByteString>() { // from class: com.explorestack.protobuf.ByteString.2
            /* JADX WARN: Type inference failed for: r0v0, types: [com.explorestack.protobuf.ByteString$ByteIterator, java.util.Iterator] */
            /* JADX WARN: Type inference failed for: r1v0, types: [com.explorestack.protobuf.ByteString$ByteIterator, java.util.Iterator] */
            @Override // java.util.Comparator
            public int compare(ByteString byteString, ByteString byteString2) {
                ?? Iterator2 = byteString.iterator2();
                ?? Iterator22 = byteString2.iterator2();
                while (Iterator2.hasNext() && Iterator22.hasNext()) {
                    int iCompare = Integer.compare(ByteString.toInt(Iterator2.nextByte()), ByteString.toInt(Iterator22.nextByte()));
                    if (iCompare != 0) {
                        return iCompare;
                    }
                }
                return Integer.compare(byteString.size(), byteString2.size());
            }
        };
    }

    private static ByteString balancedConcat(Iterator<ByteString> it, int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(p0.o2.k(i10, "length (", KerkSviMAy.IxEtAkchDNQL));
        }
        if (i10 == 1) {
            return it.next();
        }
        int i11 = i10 >>> 1;
        return balancedConcat(it, i11).concat(balancedConcat(it, i10 - i11));
    }

    public static void checkIndex(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 >= 0) {
                throw new ArrayIndexOutOfBoundsException(w0.i.a(i10, i11, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(a.b.e(i10, "Index < 0: "));
        }
    }

    public static int checkRange(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(p0.o2.k(i10, "Beginning index: ", " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(w0.i.a(i10, i11, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(w0.i.a(i11, i12, "End index: ", " >= "));
    }

    public static ByteString copyFrom(byte[] bArr, int i10, int i11) {
        checkRange(i10, i10 + i11, bArr.length);
        return new LiteralByteString(byteArrayCopier.copyFrom(bArr, i10, i11));
    }

    public static ByteString copyFromUtf8(String str) {
        return new LiteralByteString(str.getBytes(x7.f22881a));
    }

    public static CodedBuilder newCodedBuilder(int i10) {
        return new CodedBuilder(i10);
    }

    public static Output newOutput(int i10) {
        return new Output(i10);
    }

    private static ByteString readChunk(InputStream inputStream, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = inputStream.read(bArr, i11, i10 - i11);
            if (i12 == -1) {
                break;
            }
            i11 += i12;
        }
        if (i11 == 0) {
            return null;
        }
        return copyFrom(bArr, 0, i11);
    }

    public static ByteString readFrom(InputStream inputStream) throws IOException {
        return readFrom(inputStream, 256, 8192);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int toInt(byte b10) {
        return b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    private String truncateAndEscapeForDisplay() {
        if (size() <= 50) {
            return tc.h(new ob(this));
        }
        return tc.h(new ob(substring(0, 47))) + APSSharedUtil.TRUNCATE_SEPARATOR;
    }

    public static Comparator<ByteString> unsignedLexicographicalComparator() {
        return UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    }

    public static ByteString wrap(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new z9(byteBuffer);
        }
        return wrap(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
    }

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List<ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int i10);

    public final ByteString concat(ByteString byteString) {
        if (Integer.MAX_VALUE - size() < byteString.size()) {
            throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + byteString.size());
        }
        if (byteString.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return byteString;
        }
        int size = byteString.size() + size();
        if (size < 128) {
            int size2 = size();
            int size3 = byteString.size();
            byte[] bArr = new byte[size2 + size3];
            copyTo(bArr, 0, 0, size2);
            byteString.copyTo(bArr, 0, size2, size3);
            return wrap(bArr);
        }
        if (this instanceof ta) {
            ta taVar = (ta) this;
            ByteString byteString2 = taVar.f22668e;
            int size4 = byteString.size() + byteString2.size();
            ByteString byteString3 = taVar.f22667c;
            if (size4 < 128) {
                int size5 = byteString2.size();
                int size6 = byteString.size();
                byte[] bArr2 = new byte[size5 + size6];
                byteString2.copyTo(bArr2, 0, 0, size5);
                byteString.copyTo(bArr2, 0, size5, size6);
                return new ta(byteString3, wrap(bArr2));
            }
            if (byteString3.getTreeDepth() > byteString2.getTreeDepth() && taVar.f22670g > byteString.getTreeDepth()) {
                return new ta(byteString3, new ta(byteString2, byteString));
            }
        }
        if (size >= ta.c(Math.max(getTreeDepth(), byteString.getTreeDepth()) + 1)) {
            return new ta(this, byteString);
        }
        androidx.datastore.preferences.protobuf.i3 i3Var = new androidx.datastore.preferences.protobuf.i3(1);
        i3Var.b(this);
        i3Var.b(byteString);
        ArrayDeque arrayDeque = i3Var.f5906a;
        ByteString taVar2 = (ByteString) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            taVar2 = new ta((ByteString) arrayDeque.pop(), taVar2);
        }
        return taVar2;
    }

    public abstract void copyTo(ByteBuffer byteBuffer);

    public void copyTo(byte[] bArr, int i10) {
        copyTo(bArr, 0, i10, size());
    }

    public abstract void copyToInternal(byte[] bArr, int i10, int i11, int i12);

    public final boolean endsWith(ByteString byteString) {
        return size() >= byteString.size() && substring(size() - byteString.size()).equals(byteString);
    }

    public abstract boolean equals(Object obj);

    public abstract int getTreeDepth();

    public final int hashCode() {
        int iPartialHash = this.hash;
        if (iPartialHash == 0) {
            int size = size();
            iPartialHash = partialHash(size, 0, size);
            if (iPartialHash == 0) {
                iPartialHash = 1;
            }
            this.hash = iPartialHash;
        }
        return iPartialHash;
    }

    public abstract byte internalByteAt(int i10);

    public abstract boolean isBalanced();

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract boolean isValidUtf8();

    public abstract y newCodedInput();

    public abstract InputStream newInput();

    public abstract int partialHash(int i10, int i11, int i12);

    public abstract int partialIsValidUtf8(int i10, int i11, int i12);

    public final int peekCachedHashCode() {
        return this.hash;
    }

    public abstract int size();

    public final boolean startsWith(ByteString byteString) {
        return size() >= byteString.size() && substring(0, byteString.size()).equals(byteString);
    }

    public final ByteString substring(int i10) {
        return substring(i10, size());
    }

    public abstract ByteString substring(int i10, int i11);

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return x7.f22883c;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString(String str) throws UnsupportedEncodingException {
        try {
            return toString(Charset.forName(str));
        } catch (UnsupportedCharsetException e10) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e10);
            throw unsupportedEncodingException;
        }
    }

    public abstract String toStringInternal(Charset charset);

    public final String toStringUtf8() {
        return toString(x7.f22881a);
    }

    public abstract void writeTo(s sVar) throws IOException;

    public abstract void writeTo(OutputStream outputStream) throws IOException;

    public final void writeTo(OutputStream outputStream, int i10, int i11) throws IOException {
        checkRange(i10, i10 + i11, size());
        if (i11 > 0) {
            writeToInternal(outputStream, i10, i11);
        }
    }

    public abstract void writeToInternal(OutputStream outputStream, int i10, int i11) throws IOException;

    public abstract void writeToReverse(s sVar) throws IOException;

    public static Output newOutput() {
        return new Output(128);
    }

    public static ByteString readFrom(InputStream inputStream, int i10) throws IOException {
        return readFrom(inputStream, i10, i10);
    }

    @Deprecated
    public final void copyTo(byte[] bArr, int i10, int i11, int i12) {
        checkRange(i10, i10 + i12, size());
        checkRange(i11, i11 + i12, bArr.length);
        if (i12 > 0) {
            copyToInternal(bArr, i10, i11, i12);
        }
    }

    @Override // java.lang.Iterable
    /* renamed from: iterator, reason: merged with bridge method [inline-methods] */
    public Iterator<Byte> iterator2() {
        return new AbstractByteIterator() { // from class: com.explorestack.protobuf.ByteString.1
            private final int limit;
            private int position = 0;

            {
                this.limit = ByteString.this.size();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.position < this.limit;
            }

            @Override // com.explorestack.protobuf.ByteString.ByteIterator
            public byte nextByte() {
                int i10 = this.position;
                if (i10 >= this.limit) {
                    throw new NoSuchElementException();
                }
                this.position = i10 + 1;
                return ByteString.this.internalByteAt(i10);
            }
        };
    }

    public static ByteString copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static ByteString readFrom(InputStream inputStream, int i10, int i11) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            ByteString chunk = readChunk(inputStream, i10);
            if (chunk == null) {
                return copyFrom(arrayList);
            }
            arrayList.add(chunk);
            i10 = Math.min(i10 * 2, i11);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Output extends OutputStream {
        private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
        private byte[] buffer;
        private int bufferPos;
        private final ArrayList<ByteString> flushedBuffers;
        private int flushedBuffersTotalBytes;
        private final int initialCapacity;

        public Output(int i10) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.initialCapacity = i10;
            this.flushedBuffers = new ArrayList<>();
            this.buffer = new byte[i10];
        }

        private byte[] copyArray(byte[] bArr, int i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i10));
            return bArr2;
        }

        private void flushFullBuffer(int i10) {
            this.flushedBuffers.add(new LiteralByteString(this.buffer));
            int length = this.flushedBuffersTotalBytes + this.buffer.length;
            this.flushedBuffersTotalBytes = length;
            this.buffer = new byte[Math.max(this.initialCapacity, Math.max(i10, length >>> 1))];
            this.bufferPos = 0;
        }

        private void flushLastBuffer() {
            int i10 = this.bufferPos;
            byte[] bArr = this.buffer;
            if (i10 >= bArr.length) {
                this.flushedBuffers.add(new LiteralByteString(this.buffer));
                this.buffer = EMPTY_BYTE_ARRAY;
            } else if (i10 > 0) {
                this.flushedBuffers.add(new LiteralByteString(copyArray(bArr, i10)));
            }
            this.flushedBuffersTotalBytes += this.bufferPos;
            this.bufferPos = 0;
        }

        public synchronized void reset() {
            this.flushedBuffers.clear();
            this.flushedBuffersTotalBytes = 0;
            this.bufferPos = 0;
        }

        public synchronized int size() {
            return this.flushedBuffersTotalBytes + this.bufferPos;
        }

        public synchronized ByteString toByteString() {
            flushLastBuffer();
            return ByteString.copyFrom(this.flushedBuffers);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i10) {
            try {
                if (this.bufferPos == this.buffer.length) {
                    flushFullBuffer(1);
                }
                byte[] bArr = this.buffer;
                int i11 = this.bufferPos;
                this.bufferPos = i11 + 1;
                bArr[i11] = (byte) i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public void writeTo(OutputStream outputStream) throws IOException {
            ByteString[] byteStringArr;
            byte[] bArr;
            int i10;
            synchronized (this) {
                ArrayList<ByteString> arrayList = this.flushedBuffers;
                byteStringArr = (ByteString[]) arrayList.toArray(new ByteString[arrayList.size()]);
                bArr = this.buffer;
                i10 = this.bufferPos;
            }
            for (ByteString byteString : byteStringArr) {
                byteString.writeTo(outputStream);
            }
            outputStream.write(copyArray(bArr, i10));
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i10, int i11) {
            try {
                byte[] bArr2 = this.buffer;
                int length = bArr2.length;
                int i12 = this.bufferPos;
                if (i11 <= length - i12) {
                    System.arraycopy(bArr, i10, bArr2, i12, i11);
                    this.bufferPos += i11;
                } else {
                    int length2 = bArr2.length - i12;
                    System.arraycopy(bArr, i10, bArr2, i12, length2);
                    int i13 = i11 - length2;
                    flushFullBuffer(i13);
                    System.arraycopy(bArr, i10 + length2, this.buffer, 0, i13);
                    this.bufferPos = i13;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer, int i10) {
        checkRange(0, i10, byteBuffer.remaining());
        byte[] bArr = new byte[i10];
        byteBuffer.get(bArr);
        return new LiteralByteString(bArr);
    }

    public static ByteString wrap(byte[] bArr) {
        return new LiteralByteString(bArr);
    }

    public final String toString(Charset charset) {
        return size() == 0 ? "" : toStringInternal(charset);
    }

    public static ByteString wrap(byte[] bArr, int i10, int i11) {
        return new BoundedByteString(bArr, i10, i11);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        return j1.o2.o(a.b.r(size, "<ByteString@", hexString, " size=", " contents=\""), truncateAndEscapeForDisplay(), "\">");
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer) {
        return copyFrom(byteBuffer, byteBuffer.remaining());
    }

    public static ByteString copyFrom(String str, String str2) throws UnsupportedEncodingException {
        return new LiteralByteString(str.getBytes(str2));
    }

    public static ByteString copyFrom(String str, Charset charset) {
        return new LiteralByteString(str.getBytes(charset));
    }

    public static ByteString copyFrom(Iterable<ByteString> iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            Iterator<ByteString> it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = ((Collection) iterable).size();
        }
        if (size == 0) {
            return EMPTY;
        }
        return balancedConcat(iterable.iterator(), size);
    }
}
