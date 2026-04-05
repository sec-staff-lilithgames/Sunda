package te;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.util.v0;
import java.nio.ByteBuffer;
import java.util.Arrays;
import re.e;
import re.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b extends g {
    @Override // re.g
    public final Metadata a(e eVar, ByteBuffer byteBuffer) {
        return new Metadata(decode(new v0(byteBuffer.array(), byteBuffer.limit())));
    }

    public EventMessage decode(v0 v0Var) {
        return new EventMessage((String) com.google.android.exoplayer2.util.a.checkNotNull(v0Var.readNullTerminatedString()), (String) com.google.android.exoplayer2.util.a.checkNotNull(v0Var.readNullTerminatedString()), v0Var.readLong(), v0Var.readLong(), Arrays.copyOfRange(v0Var.getData(), v0Var.getPosition(), v0Var.limit()));
    }
}
