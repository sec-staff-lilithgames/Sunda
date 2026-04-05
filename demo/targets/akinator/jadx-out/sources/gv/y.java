package gv;

import com.applovin.shadow.okio.Segment;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class y {
    public static final long copyTo(Reader reader, Writer out, int i10) throws IOException {
        e0.checkNotNullParameter(reader, "<this>");
        e0.checkNotNullParameter(out, "out");
        char[] cArr = new char[i10];
        int i11 = reader.read(cArr);
        long j10 = 0;
        while (i11 >= 0) {
            out.write(cArr, 0, i11);
            j10 += i11;
            i11 = reader.read(cArr);
        }
        return j10;
    }

    public static /* synthetic */ long copyTo$default(Reader reader, Writer writer, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = Segment.SIZE;
        }
        return copyTo(reader, writer, i10);
    }

    public static final rv.t lineSequence(BufferedReader bufferedReader) {
        e0.checkNotNullParameter(bufferedReader, "<this>");
        return rv.y.constrainOnce(new u(bufferedReader));
    }

    public static final byte[] readBytes(URL url) throws IOException {
        e0.checkNotNullParameter(url, "<this>");
        InputStream inputStreamOpenStream = url.openStream();
        try {
            e0.checkNotNull(inputStreamOpenStream);
            byte[] bytes = c.readBytes(inputStreamOpenStream);
            d.closeFinally(inputStreamOpenStream, null);
            return bytes;
        } finally {
        }
    }

    public static final List<String> readLines(Reader reader) {
        e0.checkNotNullParameter(reader, "<this>");
        ArrayList arrayList = new ArrayList();
        forEachLine(reader, new n(1, arrayList));
        return arrayList;
    }

    public static final String readText(Reader reader) {
        e0.checkNotNullParameter(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        copyTo$default(reader, stringWriter, 0, 2, null);
        String string = stringWriter.toString();
        e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final <T> T useLines(Reader reader, kv.l block) {
        e0.checkNotNullParameter(reader, "<this>");
        e0.checkNotNullParameter(block, "block");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, Segment.SIZE);
        try {
            T t10 = (T) block.invoke(lineSequence(bufferedReader));
            b0.finallyStart(1);
            d.closeFinally(bufferedReader, null);
            b0.finallyEnd(1);
            return t10;
        } finally {
        }
    }

    public static final void forEachLine(Reader reader, kv.l lVar) {
        e0.checkNotNullParameter(reader, "<this>");
        e0.checkNotNullParameter(lVar, duhsDlGWdBkekB.XgfPJpDl);
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, Segment.SIZE);
        try {
            Iterator<Object> it = lineSequence(bufferedReader).iterator();
            while (it.hasNext()) {
                lVar.invoke(it.next());
            }
            d.closeFinally(bufferedReader, null);
        } finally {
        }
    }
}
