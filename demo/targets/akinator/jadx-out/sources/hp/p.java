package hp;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class p implements q {
    @Override // hp.q
    public s create(io.bidmachine.media3.common.b bVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // hp.q
    public int getCueReplacementBehavior(io.bidmachine.media3.common.b bVar) {
        return 1;
    }

    @Override // hp.q
    public boolean supportsFormat(io.bidmachine.media3.common.b bVar) {
        return false;
    }
}
