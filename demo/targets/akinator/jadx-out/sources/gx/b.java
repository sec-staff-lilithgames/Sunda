package gx;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.io.OutputStreamWriter;
import pw.g;
import retrofit2.Converter;
import uw.p;
import xv.j0;
import xv.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b implements Converter {

    /* renamed from: b, reason: collision with root package name */
    public static final j0 f58520b = j0.get("application/xml; charset=UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final p f58521a;

    public b(p pVar) {
        this.f58521a = pVar;
    }

    @Override // retrofit2.Converter
    public u0 convert(Object obj) throws IOException {
        g gVar = new g();
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(gVar.outputStream(), C.UTF8_NAME);
            this.f58521a.write(obj, outputStreamWriter);
            outputStreamWriter.flush();
            return u0.create(f58520b, gVar.readByteString());
        } catch (IOException e10) {
            throw e10;
        } catch (RuntimeException e11) {
            throw e11;
        } catch (Exception e12) {
            throw new RuntimeException(e12);
        }
    }
}
