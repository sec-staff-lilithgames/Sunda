package com.applovin.shadow.okhttp3;

import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.BufferedSource;
import com.applovin.shadow.okio.ByteString;
import gv.d;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.l;
import p0.o2;
import sv.g;
import tu.f;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class ResponseBody implements Closeable {
    public static final Companion Companion = new Companion(null);
    private Reader reader;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final BufferedSource source;

        public BomAwareReader(BufferedSource source, Charset charset) {
            e0.checkNotNullParameter(source, "source");
            e0.checkNotNullParameter(charset, "charset");
            this.source = source;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            x0 x0Var;
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
                x0Var = x0.f87415a;
            } else {
                x0Var = null;
            }
            if (x0Var == null) {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int i10, int i11) throws IOException {
            e0.checkNotNullParameter(cbuf, "cbuf");
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.delegate;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.source.inputStream(), Util.readBomAsCharset(this.source, this.charset));
                this.delegate = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, i10, i11);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public final ResponseBody create(String str, MediaType mediaType) {
            e0.checkNotNullParameter(str, "<this>");
            Charset charset = g.f86134b;
            if (mediaType != null) {
                Charset charsetCharset$default = MediaType.charset$default(mediaType, null, 1, null);
                if (charsetCharset$default == null) {
                    mediaType = MediaType.Companion.parse(mediaType + "; charset=utf-8");
                } else {
                    charset = charsetCharset$default;
                }
            }
            Buffer bufferWriteString = new Buffer().writeString(str, charset);
            return create(bufferWriteString, mediaType, bufferWriteString.size());
        }

        private Companion() {
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, ByteString byteString, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(byteString, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, BufferedSource bufferedSource, MediaType mediaType, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            if ((i10 & 2) != 0) {
                j10 = -1;
            }
            return companion.create(bufferedSource, mediaType, j10);
        }

        public final ResponseBody create(byte[] bArr, MediaType mediaType) {
            e0.checkNotNullParameter(bArr, "<this>");
            return create(new Buffer().write(bArr), mediaType, bArr.length);
        }

        public final ResponseBody create(ByteString byteString, MediaType mediaType) {
            e0.checkNotNullParameter(byteString, "<this>");
            return create(new Buffer().write(byteString), mediaType, byteString.size());
        }

        public final ResponseBody create(final BufferedSource bufferedSource, final MediaType mediaType, final long j10) {
            e0.checkNotNullParameter(bufferedSource, "<this>");
            return new ResponseBody() { // from class: com.applovin.shadow.okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // com.applovin.shadow.okhttp3.ResponseBody
                public long contentLength() {
                    return j10;
                }

                @Override // com.applovin.shadow.okhttp3.ResponseBody
                public MediaType contentType() {
                    return mediaType;
                }

                @Override // com.applovin.shadow.okhttp3.ResponseBody
                public BufferedSource source() {
                    return bufferedSource;
                }
            };
        }

        @f
        public final ResponseBody create(MediaType mediaType, String content) {
            e0.checkNotNullParameter(content, "content");
            return create(content, mediaType);
        }

        @f
        public final ResponseBody create(MediaType mediaType, byte[] content) {
            e0.checkNotNullParameter(content, "content");
            return create(content, mediaType);
        }

        @f
        public final ResponseBody create(MediaType mediaType, ByteString content) {
            e0.checkNotNullParameter(content, "content");
            return create(content, mediaType);
        }

        @f
        public final ResponseBody create(MediaType mediaType, long j10, BufferedSource content) {
            e0.checkNotNullParameter(content, "content");
            return create(content, mediaType, j10);
        }
    }

    private final Charset charset() {
        Charset charset;
        MediaType mediaTypeContentType = contentType();
        return (mediaTypeContentType == null || (charset = mediaTypeContentType.charset(g.f86134b)) == null) ? g.f86134b : charset;
    }

    private final <T> T consumeSource(l lVar, l lVar2) throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(o2.m(jContentLength, "Cannot buffer entire body for content length: "));
        }
        BufferedSource bufferedSourceSource = source();
        try {
            T t10 = (T) lVar.invoke(bufferedSourceSource);
            b0.finallyStart(1);
            d.closeFinally(bufferedSourceSource, null);
            b0.finallyEnd(1);
            int iIntValue = ((Number) lVar2.invoke(t10)).intValue();
            if (jContentLength == -1 || jContentLength == iIntValue) {
                return t10;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iIntValue + ") disagree");
        } finally {
        }
    }

    @f
    public static final ResponseBody create(MediaType mediaType, long j10, BufferedSource bufferedSource) {
        return Companion.create(mediaType, j10, bufferedSource);
    }

    public final InputStream byteStream() {
        return source().inputStream();
    }

    public final ByteString byteString() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(o2.m(jContentLength, "Cannot buffer entire body for content length: "));
        }
        BufferedSource bufferedSourceSource = source();
        try {
            ByteString byteString = bufferedSourceSource.readByteString();
            d.closeFinally(bufferedSourceSource, null);
            int size = byteString.size();
            if (jContentLength == -1 || jContentLength == size) {
                return byteString;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + size + ") disagree");
        } finally {
        }
    }

    public final byte[] bytes() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(o2.m(jContentLength, "Cannot buffer entire body for content length: "));
        }
        BufferedSource bufferedSourceSource = source();
        try {
            byte[] byteArray = bufferedSourceSource.readByteArray();
            d.closeFinally(bufferedSourceSource, null);
            int length = byteArray.length;
            if (jContentLength == -1 || jContentLength == length) {
                return byteArray;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(source(), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Util.closeQuietly(source());
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract BufferedSource source();

    public final String string() throws IOException {
        BufferedSource bufferedSourceSource = source();
        try {
            String string = bufferedSourceSource.readString(Util.readBomAsCharset(bufferedSourceSource, charset()));
            d.closeFinally(bufferedSourceSource, null);
            return string;
        } finally {
        }
    }

    @f
    public static final ResponseBody create(MediaType mediaType, ByteString byteString) {
        return Companion.create(mediaType, byteString);
    }

    @f
    public static final ResponseBody create(MediaType mediaType, String str) {
        return Companion.create(mediaType, str);
    }

    @f
    public static final ResponseBody create(MediaType mediaType, byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    public static final ResponseBody create(BufferedSource bufferedSource, MediaType mediaType, long j10) {
        return Companion.create(bufferedSource, mediaType, j10);
    }

    public static final ResponseBody create(ByteString byteString, MediaType mediaType) {
        return Companion.create(byteString, mediaType);
    }

    public static final ResponseBody create(String str, MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    public static final ResponseBody create(byte[] bArr, MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }
}
