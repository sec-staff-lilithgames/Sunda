package l0;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f72153a;

    /* renamed from: b, reason: collision with root package name */
    public a f72154b;

    /* renamed from: c, reason: collision with root package name */
    public a f72155c;

    /* renamed from: d, reason: collision with root package name */
    public int f72156d;

    /* renamed from: e, reason: collision with root package name */
    public Long f72157e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f72158f;

    public q1() {
        this(0, 1, null);
    }

    public static /* synthetic */ void snapshotIfNeeded$default(q1 q1Var, m2.j0 j0Var, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = s1.timeNowMillis();
        }
        q1Var.snapshotIfNeeded(j0Var, j10);
    }

    public final void forceNextSnapshot() {
        this.f72158f = true;
    }

    public final int getMaxStoredCharacters() {
        return this.f72153a;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void makeSnapshot(m2.j0 r4) {
        /*
            r3 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.e0.checkNotNullParameter(r4, r0)
            r0 = 0
            r3.f72158f = r0
            l0.q1$a r0 = r3.f72154b
            r1 = 0
            if (r0 == 0) goto L12
            m2.j0 r0 = r0.getValue()
            goto L13
        L12:
            r0 = r1
        L13:
            boolean r0 = kotlin.jvm.internal.e0.areEqual(r4, r0)
            if (r0 == 0) goto L1b
            goto L82
        L1b:
            java.lang.String r0 = r4.getText()
            l0.q1$a r2 = r3.f72154b
            if (r2 == 0) goto L2e
            m2.j0 r2 = r2.getValue()
            if (r2 == 0) goto L2e
            java.lang.String r2 = r2.getText()
            goto L2f
        L2e:
            r2 = r1
        L2f:
            boolean r0 = kotlin.jvm.internal.e0.areEqual(r0, r2)
            if (r0 == 0) goto L3e
            l0.q1$a r0 = r3.f72154b
            if (r0 != 0) goto L3a
            goto L82
        L3a:
            r0.setValue(r4)
            return
        L3e:
            l0.q1$a r0 = r3.f72154b
            l0.q1$a r2 = new l0.q1$a
            r2.<init>(r0, r4)
            r3.f72154b = r2
            r3.f72155c = r1
            int r0 = r3.f72156d
            java.lang.String r4 = r4.getText()
            int r4 = r4.length()
            int r4 = r4 + r0
            r3.f72156d = r4
            int r0 = r3.f72153a
            if (r4 <= r0) goto L82
            l0.q1$a r4 = r3.f72154b
            if (r4 == 0) goto L63
            l0.q1$a r0 = r4.getNext()
            goto L64
        L63:
            r0 = r1
        L64:
            if (r0 != 0) goto L67
            goto L82
        L67:
            if (r4 == 0) goto L74
            l0.q1$a r0 = r4.getNext()
            if (r0 == 0) goto L74
            l0.q1$a r0 = r0.getNext()
            goto L75
        L74:
            r0 = r1
        L75:
            if (r0 == 0) goto L7c
            l0.q1$a r4 = r4.getNext()
            goto L67
        L7c:
            if (r4 != 0) goto L7f
            goto L82
        L7f:
            r4.setNext(r1)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.q1.makeSnapshot(m2.j0):void");
    }

    public final m2.j0 redo() {
        a aVar = this.f72155c;
        if (aVar == null) {
            return null;
        }
        this.f72155c = aVar.getNext();
        this.f72154b = new a(this.f72154b, aVar.getValue());
        this.f72156d = aVar.getValue().getText().length() + this.f72156d;
        return aVar.getValue();
    }

    public final void snapshotIfNeeded(m2.j0 value, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        if (!this.f72158f) {
            Long l9 = this.f72157e;
            if (j10 <= (l9 != null ? l9.longValue() : 0L) + r1.getSNAPSHOTS_INTERVAL_MILLIS()) {
                return;
            }
        }
        this.f72157e = Long.valueOf(j10);
        makeSnapshot(value);
    }

    public final m2.j0 undo() {
        a next;
        a aVar = this.f72154b;
        if (aVar == null || (next = aVar.getNext()) == null) {
            return null;
        }
        this.f72154b = next;
        this.f72156d -= aVar.getValue().getText().length();
        this.f72155c = new a(this.f72155c, aVar.getValue());
        return next.getValue();
    }

    public q1(int i10) {
        this.f72153a = i10;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public a f72159a;

        /* renamed from: b, reason: collision with root package name */
        public m2.j0 f72160b;

        public a(a aVar, m2.j0 value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this.f72159a = aVar;
            this.f72160b = value;
        }

        public final a getNext() {
            return this.f72159a;
        }

        public final m2.j0 getValue() {
            return this.f72160b;
        }

        public final void setNext(a aVar) {
            this.f72159a = aVar;
        }

        public final void setValue(m2.j0 j0Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(j0Var, "<set-?>");
            this.f72160b = j0Var;
        }

        public /* synthetic */ a(a aVar, m2.j0 j0Var, int i10, kotlin.jvm.internal.u uVar) {
            this((i10 & 1) != 0 ? null : aVar, j0Var);
        }
    }

    public /* synthetic */ q1(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? DefaultOggSeeker.MATCH_BYTE_RANGE : i10);
    }
}
