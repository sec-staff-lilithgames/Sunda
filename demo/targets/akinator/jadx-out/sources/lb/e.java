package lb;

import android.graphics.Bitmap;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt__BuildersKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: n, reason: collision with root package name */
    public static ArrayList f72801n;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f72802a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f72803b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f72804c;

    /* renamed from: d, reason: collision with root package name */
    public final String f72805d;

    /* renamed from: e, reason: collision with root package name */
    public final String f72806e;

    /* renamed from: f, reason: collision with root package name */
    public final String f72807f;

    /* renamed from: g, reason: collision with root package name */
    public final String f72808g;

    /* renamed from: h, reason: collision with root package name */
    public final String f72809h;

    /* renamed from: i, reason: collision with root package name */
    public final lb.c f72810i;

    /* renamed from: j, reason: collision with root package name */
    public int f72811j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f72812k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f72813l;

    /* renamed from: m, reason: collision with root package name */
    public final i f72814m;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public int f72821b;

        /* renamed from: c, reason: collision with root package name */
        public String f72822c;

        /* renamed from: e, reason: collision with root package name */
        public int f72823e;

        /* renamed from: f, reason: collision with root package name */
        public String f72824f;

        /* renamed from: g, reason: collision with root package name */
        public int f72825g;

        /* renamed from: h, reason: collision with root package name */
        public int f72826h = -1;

        /* renamed from: i, reason: collision with root package name */
        public String f72827i;

        /* renamed from: j, reason: collision with root package name */
        public int f72828j;

        public final int getAwardType() {
            return this.f72826h;
        }

        public final int getDelayAward() {
            return this.f72825g;
        }

        public final int getFlagPhoto() {
            return this.f72823e;
        }

        public final String getIdBase() {
            return this.f72822c;
        }

        public final int getNbPlayed() {
            return this.f72821b;
        }

        public final String getPreviousTime() {
            return this.f72824f;
        }

        public final String getSignatureAkiAward() {
            return this.f72827i;
        }

        public final int getStatusFiltre() {
            return this.f72828j;
        }

        public final void setAwardType(int i10) {
            this.f72826h = i10;
        }

        public final void setDelayAward(int i10) {
            this.f72825g = i10;
        }

        public final void setFlagPhoto(int i10) {
            this.f72823e = i10;
        }

        public final void setIdBase(String str) {
            this.f72822c = str;
        }

        public final void setNbPlayed(int i10) {
            this.f72821b = i10;
        }

        public final void setPreviousTime(String str) {
            this.f72824f = str;
        }

        public final void setSignatureAkiAward(String str) {
            this.f72827i = str;
        }

        public final void setStatusFiltre(int i10) {
            this.f72828j = i10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public final int f72829b;

        /* renamed from: c, reason: collision with root package name */
        public final String f72830c;

        public d(int i10, String str) {
            this.f72829b = i10;
            this.f72830c = str;
        }

        public final int getIndex() {
            return this.f72829b;
        }

        public final String getValue() {
            return this.f72830c;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class f extends b {

        /* renamed from: i, reason: collision with root package name */
        public int f72836i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f72837j;

        /* renamed from: k, reason: collision with root package name */
        public int f72838k;

        public f() {
        }

        public final int getIdSession() {
            return this.f72836i;
        }

        public final int getRankingLimit() {
            return this.f72838k;
        }

        public final boolean isValidateConstraint() {
            return this.f72837j;
        }

        public final void setIdSession(int i10) {
            this.f72836i = i10;
        }

        public final void setRankingLimit(int i10) {
            this.f72838k = i10;
        }

        public final void setValideConstrait(boolean z10) {
            this.f72837j = z10;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String idBase, String name, String description, int i10, String str, boolean z10, int i11) {
            super(idBase, name, description, str);
            kotlin.jvm.internal.e0.checkNotNullParameter(idBase, "idBase");
            kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.e0.checkNotNullParameter(description, "description");
            this.f72836i = i10;
            this.f72837j = z10;
            this.f72838k = i11;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class h implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public int f72842b;

        /* renamed from: c, reason: collision with root package name */
        public String f72843c;

        /* renamed from: e, reason: collision with root package name */
        public boolean f72844e;

        public final int getId() {
            return this.f72842b;
        }

        public final String getQuestion() {
            return this.f72843c;
        }

        public final boolean isValidated() {
            return this.f72844e;
        }

        public final void setId(int i10) {
            this.f72842b = i10;
        }

        public final void setQuestion(String str) {
            this.f72843c = str;
        }

        public final void setValidated(boolean z10) {
            this.f72844e = z10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class i implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public String f72845b;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList f72846c;

        /* renamed from: e, reason: collision with root package name */
        public float f72847e;

        /* renamed from: f, reason: collision with root package name */
        public int f72848f;

        /* renamed from: g, reason: collision with root package name */
        public ArrayList f72849g;

        /* renamed from: h, reason: collision with root package name */
        public ArrayList f72850h;

        /* renamed from: i, reason: collision with root package name */
        public HashMap f72851i;

        public final ArrayList<d> getAnswers() {
            return this.f72846c;
        }

        public final HashMap<String, String> getExtra() {
            return this.f72851i;
        }

        public final ArrayList<String> getProbaAnswers() {
            return this.f72849g;
        }

        public final float getProgression() {
            return this.f72847e;
        }

        public final String getQuestion() {
            return this.f72845b;
        }

        public final int getStep() {
            return this.f72848f;
        }

        public final ArrayList<Float> getTrouvitudes() {
            return this.f72850h;
        }

        public final void setAnswers$limuleapi_release(ArrayList<d> arrayList) {
            this.f72846c = arrayList;
        }

        public final void setExtra$limuleapi_release(HashMap<String, String> map) {
            this.f72851i = map;
        }

        public final void setProbaAnswers$limuleapi_release(ArrayList<String> arrayList) {
            this.f72849g = arrayList;
        }

        public final void setProgression(float f10) {
            this.f72847e = f10;
        }

        public final void setQuestion(String str) {
            this.f72845b = str;
        }

        public final void setStep(int i10) {
            this.f72848f = i10;
        }

        public final void setTrouvitudes(ArrayList<Float> arrayList) {
            this.f72850h = arrayList;
        }
    }

    static {
        new a(null);
        f72801n = new ArrayList();
    }

    public e(lb.c instance, String baseURL, String channel, String session, String signature, String challengeAuth, boolean z10, boolean z11, boolean z12, boolean z13) {
        kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
        kotlin.jvm.internal.e0.checkNotNullParameter(baseURL, "baseURL");
        kotlin.jvm.internal.e0.checkNotNullParameter(channel, "channel");
        kotlin.jvm.internal.e0.checkNotNullParameter(session, "session");
        kotlin.jvm.internal.e0.checkNotNullParameter(signature, "signature");
        kotlin.jvm.internal.e0.checkNotNullParameter(challengeAuth, "challengeAuth");
        this.f72805d = "";
        this.f72806e = "";
        this.f72807f = "";
        this.f72808g = "";
        this.f72809h = "";
        this.f72812k = true;
        this.f72813l = true;
        this.f72814m = new i();
        this.f72810i = instance;
        this.f72809h = baseURL;
        this.f72805d = channel;
        this.f72806e = session;
        this.f72807f = signature;
        this.f72808g = challengeAuth;
        this.f72802a = z13;
        this.f72803b = z10;
        this.f72812k = z11;
        this.f72813l = z12;
    }

    public static void a(long j10) {
        if (f72801n == null) {
            f72801n = new ArrayList();
        }
        ArrayList arrayList = f72801n;
        kotlin.jvm.internal.e0.checkNotNull(arrayList);
        if (arrayList.size() >= 5) {
            ArrayList arrayList2 = f72801n;
            kotlin.jvm.internal.e0.checkNotNull(arrayList2);
            arrayList2.remove(0);
        }
        ArrayList arrayList3 = f72801n;
        kotlin.jvm.internal.e0.checkNotNull(arrayList3);
        arrayList3.add(Long.valueOf(j10));
        ArrayList arrayList4 = f72801n;
        kotlin.jvm.internal.e0.checkNotNull(arrayList4);
        Iterator it = arrayList4.iterator();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(it, "iterator(...)");
        long j11 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(next, "next(...)");
            long jLongValue = ((Number) next).longValue();
            if (jLongValue > j11) {
                j11 = jLongValue;
            }
        }
        qb.z.f82725k.setTIMEOUT_DEFAULT_ANSWERS((int) Math.max(10000L, 2 * j11));
    }

    public static /* synthetic */ int addPhotoToObjectWithId$default(e eVar, String str, Bitmap bitmap, String str2, String str3, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        return eVar.addPhotoToObjectWithId(str, bitmap, str2, str3);
    }

    public static /* synthetic */ Object addPhotoToObjectWithIdAsync$default(e eVar, String str, Bitmap bitmap, String str2, String str3, zu.d dVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        return eVar.addPhotoToObjectWithIdAsync(str, bitmap, str2, str3, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object answerQuestionWithTagWithOptionalParamatersAsync$default(e eVar, int i10, HashMap map, zu.d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            map = null;
        }
        return eVar.answerQuestionWithTagWithOptionalParamatersAsync(i10, map, dVar);
    }

    public static /* synthetic */ int excludeProposition$default(e eVar, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        return eVar.excludeProposition(num);
    }

    public static /* synthetic */ Object excludePropositionAsync$default(e eVar, Integer num, zu.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        return eVar.excludePropositionAsync(num, dVar);
    }

    public static /* synthetic */ int getObjectForProposition$default(e eVar, f fVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return eVar.getObjectForProposition(fVar, z10, z11);
    }

    public static /* synthetic */ Object getObjectForPropositionAsync$default(e eVar, f fVar, boolean z10, boolean z11, zu.d dVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return eVar.getObjectForPropositionAsync(fVar, z10, z11, dVar);
    }

    public final int addAnswerQuestionToAsk(String objectId, String questionId, String answer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(objectId, "objectId");
        kotlin.jvm.internal.e0.checkNotNullParameter(questionId, "questionId");
        kotlin.jvm.internal.e0.checkNotNullParameter(answer, "answer");
        return new qb.a(this, objectId, questionId, answer).call();
    }

    public final int addNewQuestionWithLabelAndAnswers(String str, ArrayList<d> arrayList) {
        return ((Number) BuildersKt__BuildersKt.runBlocking$default(null, new lb.f(this, str, arrayList, null), 1, null)).intValue();
    }

    public final Object addNewQuestionWithLabelAndAnswersAsync(String str, ArrayList<d> arrayList, zu.d<? super Integer> dVar) {
        return (arrayList == null || str == null || kotlin.jvm.internal.e0.areEqual(str, "")) ? bv.b.boxInt(100) : new qb.c(this, str, arrayList).callAsync(dVar);
    }

    public final int addPhotoToObjectWithId(String objectIdBase, Bitmap bitmap, String reason, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(objectIdBase, "objectIdBase");
        kotlin.jvm.internal.e0.checkNotNullParameter(reason, "reason");
        return ((Number) BuildersKt__BuildersKt.runBlocking$default(null, new lb.g(this, objectIdBase, bitmap, reason, str, null), 1, null)).intValue();
    }

    public final Object addPhotoToObjectWithIdAsync(String str, Bitmap bitmap, String str2, String str3, zu.d<? super Integer> dVar) {
        return (str.length() == 0 || bitmap == null) ? bv.b.boxInt(100) : this.f72804c ? bv.b.boxInt(200) : new qb.b(this, str, bitmap, str2, str3).callAsync(dVar);
    }

    public final int answerQuestionWithTag(int i10) {
        return ((Number) BuildersKt__BuildersKt.runBlocking$default(null, new lb.h(this, i10, null), 1, null)).intValue();
    }

    public final Object answerQuestionWithTagAsync(int i10, zu.d<? super Integer> dVar) {
        return answerQuestionWithTagWithOptionalParamatersAsync(i10, null, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object answerQuestionWithTagWithOptionalParamatersAsync(int r12, java.util.HashMap<java.lang.String, java.lang.String> r13, zu.d<? super java.lang.Integer> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof lb.j
            if (r0 == 0) goto L13
            r0 = r14
            lb.j r0 = (lb.j) r0
            int r1 = r0.f72897m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f72897m = r1
            goto L18
        L13:
            lb.j r0 = new lb.j
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f72895k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f72897m
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            long r12 = r0.f72894j
            lb.e r0 = r0.f72893i
            tu.a0.throwOnFailure(r14)
            r4 = r0
            goto L5c
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            tu.a0.throwOnFailure(r14)
            lb.e$i r14 = r11.f72814m
            if (r14 != 0) goto L44
            r12 = 400(0x190, float:5.6E-43)
            java.lang.Integer r12 = bv.b.boxInt(r12)
            return r12
        L44:
            long r4 = java.lang.System.currentTimeMillis()
            qb.d r14 = new qb.d
            r14.<init>(r11, r12, r13)
            r0.f72893i = r11
            r0.f72894j = r4
            r0.f72897m = r3
            java.lang.Object r14 = r14.callAsync(r0)
            if (r14 != r1) goto L5a
            return r1
        L5a:
            r12 = r4
            r4 = r11
        L5c:
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            timber.log.Timber$Forest r0 = timber.log.Timber.Forest
            java.lang.String r1 = "Webservice"
            timber.log.Timber$Tree r0 = r0.tag(r1)
            java.lang.String r1 = "AnswerWS return code : "
            java.lang.String r1 = a.b.e(r14, r1)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0.d(r1, r2)
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 300(0x12c, float:4.2E-43)
            if (r14 != r2) goto L8f
            lb.e$i r2 = r4.f72814m
            int r2 = r2.getStep()
            int r7 = r2 + 1
            r9 = 0
            r10 = 0
            r5 = 0
            r6 = 0
            r8 = 1120403456(0x42c80000, float:100.0)
            r4.updateSessionState(r5, r6, r7, r8, r9, r10)
        L8f:
            long r0 = r0 - r12
            r4.getClass()
            a(r0)
            java.lang.Integer r12 = bv.b.boxInt(r14)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.e.answerQuestionWithTagWithOptionalParamatersAsync(int, java.util.HashMap, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r12, boolean r13, boolean r14, java.lang.String r15, lb.e.c r16, zu.d r17) {
        /*
            r11 = this;
            r0 = r16
            r1 = r17
            boolean r2 = r1 instanceof lb.o0
            if (r2 == 0) goto L17
            r2 = r1
            lb.o0 r2 = (lb.o0) r2
            int r3 = r2.f72939m
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f72939m = r3
            goto L1c
        L17:
            lb.o0 r2 = new lb.o0
            r2.<init>(r11, r1)
        L1c:
            java.lang.Object r1 = r2.f72937k
            java.lang.Object r9 = av.e.getCOROUTINE_SUSPENDED()
            int r3 = r2.f72939m
            r10 = 1
            if (r3 == 0) goto L3b
            if (r3 != r10) goto L33
            qb.h r0 = r2.f72936j
            lb.e$c r2 = r2.f72935i
            tu.a0.throwOnFailure(r1)
            r3 = r0
            r0 = r2
            goto L5a
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3b:
            tu.a0.throwOnFailure(r1)
            if (r12 < 0) goto La3
            if (r0 != 0) goto L43
            goto La3
        L43:
            qb.h r3 = new qb.h
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r3.<init>(r4, r5, r6, r7, r8)
            r2.f72935i = r0
            r2.f72936j = r3
            r2.f72939m = r10
            java.lang.Object r1 = r3.callAsync(r2)
            if (r1 != r9) goto L5a
            return r9
        L5a:
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 != 0) goto L9e
            lb.e$c r2 = r3.getLimuleObjectStats()
            java.lang.String r3 = r2.getIdBase()
            r0.setIdBase(r3)
            int r3 = r2.getNbPlayed()
            r0.setNbPlayed(r3)
            int r3 = r2.getDelayAward()
            r0.setDelayAward(r3)
            java.lang.String r3 = r2.getPreviousTime()
            r0.setPreviousTime(r3)
            int r3 = r2.getFlagPhoto()
            r0.setFlagPhoto(r3)
            int r3 = r2.getAwardType()
            r0.setAwardType(r3)
            java.lang.String r3 = r2.getSignatureAkiAward()
            r0.setSignatureAkiAward(r3)
            int r2 = r2.getStatusFiltre()
            r0.setStatusFiltre(r2)
        L9e:
            java.lang.Integer r0 = bv.b.boxInt(r1)
            return r0
        La3:
            r0 = 100
            java.lang.Integer r0 = bv.b.boxInt(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.e.b(int, boolean, boolean, java.lang.String, lb.e$c, zu.d):java.lang.Object");
    }

    public final int cancelAnswer(i iVar) {
        return ((Number) BuildersKt__BuildersKt.runBlocking$default(null, new k(this, iVar, null), 1, null)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object cancelAnswerAsync(lb.e.i r5, zu.d<? super java.lang.Integer> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof lb.l
            if (r0 == 0) goto L13
            r0 = r6
            lb.l r0 = (lb.l) r0
            int r1 = r0.f72914m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f72914m = r1
            goto L18
        L13:
            lb.l r0 = new lb.l
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f72912k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f72914m
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            lb.e$i r5 = r0.f72911j
            lb.e r0 = r0.f72910i
            tu.a0.throwOnFailure(r6)
            goto L5f
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            tu.a0.throwOnFailure(r6)
            if (r5 != 0) goto L41
            r5 = 100
            java.lang.Integer r5 = bv.b.boxInt(r5)
            return r5
        L41:
            lb.e$i r6 = r4.f72814m
            if (r6 != 0) goto L4c
            r5 = 400(0x190, float:5.6E-43)
            java.lang.Integer r5 = bv.b.boxInt(r5)
            return r5
        L4c:
            qb.e r6 = new qb.e
            r6.<init>(r4)
            r0.f72910i = r4
            r0.f72911j = r5
            r0.f72914m = r3
            java.lang.Object r6 = r6.callAsync(r0)
            if (r6 != r1) goto L5e
            return r1
        L5e:
            r0 = r4
        L5f:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 != 0) goto L93
            lb.e$i r0 = r0.f72814m
            int r1 = r0.getStep()
            r5.setStep(r1)
            java.lang.String r1 = r0.getQuestion()
            r5.setQuestion(r1)
            float r1 = r0.getProgression()
            r5.setProgression(r1)
            java.util.ArrayList r1 = r0.getAnswers()
            r5.setAnswers$limuleapi_release(r1)
            java.util.HashMap r1 = r0.getExtra()
            r5.setExtra$limuleapi_release(r1)
            java.util.ArrayList r0 = r0.getTrouvitudes()
            r5.setTrouvitudes(r0)
        L93:
            java.lang.Integer r5 = bv.b.boxInt(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.e.cancelAnswerAsync(lb.e$i, zu.d):java.lang.Object");
    }

    public final int cancelSession() {
        return ((Number) BuildersKt__BuildersKt.runBlocking$default(null, new m(this, null), 1, null)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object cancelSessionAsync(zu.d<? super java.lang.Integer> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof lb.n
            if (r0 == 0) goto L13
            r0 = r5
            lb.n r0 = (lb.n) r0
            int r1 = r0.f72927l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f72927l = r1
            goto L18
        L13:
            lb.n r0 = new lb.n
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f72925j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f72927l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            lb.e r0 = r0.f72924i
            tu.a0.throwOnFailure(r5)
            goto L47
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            tu.a0.throwOnFailure(r5)
            qb.f r5 = new qb.f
            r5.<init>(r4)
            r0.f72924i = r4
            r0.f72927l = r3
            java.lang.Object r5 = r5.callAsync(r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            r0 = r4
        L47:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r1 = 0
            r0.f72804c = r1
            java.lang.Integer r5 = bv.b.boxInt(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.e.cancelSessionAsync(zu.d):java.lang.Object");
    }

    public final void cancelSessionOnSecondaryThread() {
        new Thread(new ji.t(this, 4)).start();
    }

    public final int checkTrap(g gVar) {
        return ((Number) BuildersKt__BuildersKt.runBlocking$default(null, new o(this, gVar, null), 1, null)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object checkTrapAsync(lb.e.g r6, zu.d<? super java.lang.Integer> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof lb.p
            if (r0 == 0) goto L13
            r0 = r7
            lb.p r0 = (lb.p) r0
            int r1 = r0.f72944m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f72944m = r1
            goto L18
        L13:
            lb.p r0 = new lb.p
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f72942k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f72944m
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            qb.g r6 = r0.f72941j
            lb.e$g r0 = r0.f72940i
            tu.a0.throwOnFailure(r7)
            goto L57
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            tu.a0.throwOnFailure(r7)
            if (r6 != 0) goto L41
            r6 = 100
            java.lang.Integer r6 = bv.b.boxInt(r6)
            return r6
        L41:
            qb.g r7 = new qb.g
            r7.<init>(r5)
            r0.f72940i = r6
            r0.f72941j = r7
            r0.f72944m = r3
            java.lang.Object r0 = r7.callAsync(r0)
            if (r0 != r1) goto L53
            return r1
        L53:
            r4 = r0
            r0 = r6
            r6 = r7
            r7 = r4
        L57:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r7 != 0) goto Lb3
            lb.e$g r6 = r6.getProposedLimuleTrap()
            kotlin.jvm.internal.e0.checkNotNull(r6)
            int r1 = r6.getRankingLimit()
            r0.setRankingLimit(r1)
            boolean r1 = r6.isValidateConstraint()
            r0.setValideConstrait(r1)
            int r1 = r6.getIdSession()
            r0.setIdSession(r1)
            java.lang.String r1 = r6.getIdBase()
            r0.setIdBase(r1)
            java.lang.String r1 = r6.getDescription()
            r0.setDescription(r1)
            java.lang.String r1 = r6.getPicturePath()
            r0.setPicturePath(r1)
            java.lang.String r1 = r6.getName()
            r0.setName(r1)
            java.util.HashMap r1 = r6.getExtra()
            r0.setExtra(r1)
            int r1 = r6.getElementMinibaseId()
            r0.setElementMinibaseId(r1)
            boolean r1 = r6.isMyWorldAddable()
            r0.setMyWorldAddable(r1)
            int r6 = r6.getNbPlayed()
            r0.setNbPlayed(r6)
        Lb3:
            java.lang.Integer r6 = bv.b.boxInt(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.e.checkTrapAsync(lb.e$g, zu.d):java.lang.Object");
    }

    public final int correctName(String str, String str2, String str3, String str4, String str5, String str6) {
        return ((Number) BuildersKt__BuildersKt.runBlocking$default(null, new q(this, str, str2, str3, str4, str5, str6, null), 1, null)).intValue();
    }

    public final Object correctNameAsync(String str, String str2, String str3, String str4, String str5, String str6, zu.d<? super Integer> dVar) {
        return (str == null || str2 == null || str3 == null || str4 == null || str5 == null || str6 == null) ? bv.b.boxInt(100) : new qb.i(this, str, str2, str3, str4, str5, str6).callAsync(dVar);
    }

    public final int excludeProposition(Integer num) {
        return ((Number) BuildersKt__BuildersKt.runBlocking$default(null, new r(this, num, null), 1, null)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object excludePropositionAsync(java.lang.Integer r5, zu.d<? super java.lang.Integer> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof lb.t
            if (r0 == 0) goto L13
            r0 = r6
            lb.t r0 = (lb.t) r0
            int r1 = r0.f72997l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f72997l = r1
            goto L18
        L13:
            lb.t r0 = new lb.t
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f72995j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f72997l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            lb.e r5 = r0.f72994i
            tu.a0.throwOnFailure(r6)
            goto L52
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            tu.a0.throwOnFailure(r6)
            boolean r6 = r4.f72804c
            if (r6 != 0) goto L41
            r5 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r5 = bv.b.boxInt(r5)
            return r5
        L41:
            qb.m r6 = new qb.m
            r6.<init>(r4, r5)
            r0.f72994i = r4
            r0.f72997l = r3
            java.lang.Object r6 = r6.callAsync(r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            r5 = r4
        L52:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 != 0) goto L5f
            r6 = -1
            int r6 = r5.answerQuestionWithTag(r6)
        L5f:
            java.lang.Integer r5 = bv.b.boxInt(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.e.excludePropositionAsync(java.lang.Integer, zu.d):java.lang.Object");
    }

    public final int getAutocompletionSuggestionsFromString(String sequenceAutoComplete, ArrayList<String> arrayList) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sequenceAutoComplete, "sequenceAutoComplete");
        return ((Number) BuildersKt__BuildersKt.runBlocking$default(null, new u(this, sequenceAutoComplete, arrayList, null), 1, null)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getAutocompletionSuggestionsFromStringAsync(java.lang.String r6, java.util.ArrayList<java.lang.String> r7, zu.d<? super java.lang.Integer> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof lb.v
            if (r0 == 0) goto L13
            r0 = r8
            lb.v r0 = (lb.v) r0
            int r1 = r0.f73009m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f73009m = r1
            goto L18
        L13:
            lb.v r0 = new lb.v
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f73007k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f73009m
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            qb.t r6 = r0.f73006j
            java.util.ArrayList r7 = r0.f73005i
            tu.a0.throwOnFailure(r8)
            goto L5a
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            tu.a0.throwOnFailure(r8)
            if (r7 != 0) goto L41
            r6 = 100
            java.lang.Integer r6 = bv.b.boxInt(r6)
            return r6
        L41:
            r7.clear()
            qb.t r8 = new qb.t
            r2 = 5
            r8.<init>(r5, r6, r2)
            r0.f73005i = r7
            r0.f73006j = r8
            r0.f73009m = r3
            java.lang.Object r6 = r8.callAsync(r0)
            if (r6 != r1) goto L57
            return r1
        L57:
            r4 = r8
            r8 = r6
            r6 = r4
        L5a:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 != 0) goto L84
            java.util.ArrayList r6 = r6.getListOfSuggestions()
            java.util.Iterator r6 = r6.iterator()
            java.lang.String r0 = "iterator(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r6, r0)
        L6f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L84
            java.lang.Object r0 = r6.next()
            java.lang.String r1 = "next(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            r7.add(r0)
            goto L6f
        L84:
            java.lang.Integer r6 = bv.b.boxInt(r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.e.getAutocompletionSuggestionsFromStringAsync(java.lang.String, java.util.ArrayList, zu.d):java.lang.Object");
    }

    public final int getBaseLogiqueId() {
        lb.c cVar = this.f72810i;
        kotlin.jvm.internal.e0.checkNotNull(cVar);
        return cVar.f72765e;
    }

    public final String getBaseUrlWS() {
        return this.f72809h;
    }

    public final String getChallengeAuth() {
        return this.f72808g;
    }

    public final String getChannel() {
        return this.f72805d;
    }

    public final i getCurrentSessionProgression() {
        return this.f72814m;
    }

    public final lb.b getDuelPhoto(String objectId) throws nb.b {
        kotlin.jvm.internal.e0.checkNotNullParameter(objectId, "objectId");
        qb.j jVar = new qb.j(this, objectId);
        if (jVar.call() == 0) {
            return new lb.b(Integer.parseInt(objectId), jVar.getIdPhoto1(), jVar.getUrlPhoto1(), jVar.getPseudoPhoto1(), jVar.getNbVotes1(), jVar.getIdPhoto2(), jVar.getUrlPhoto2(), jVar.getPseudoPhoto2(), jVar.getNbVotes2());
        }
        throw new nb.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getDuelPhotoAsync(java.lang.String r13, zu.d<? super lb.b> r14) throws nb.b {
        /*
            r12 = this;
            boolean r0 = r14 instanceof lb.w
            if (r0 == 0) goto L13
            r0 = r14
            lb.w r0 = (lb.w) r0
            int r1 = r0.f73018m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f73018m = r1
            goto L18
        L13:
            lb.w r0 = new lb.w
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f73016k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f73018m
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            qb.j r13 = r0.f73015j
            java.lang.String r0 = r0.f73014i
            tu.a0.throwOnFailure(r14)
            r11 = r14
            r14 = r13
            r13 = r0
            r0 = r11
            goto L4e
        L31:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L39:
            tu.a0.throwOnFailure(r14)
            qb.j r14 = new qb.j
            r14.<init>(r12, r13)
            r0.f73014i = r13
            r0.f73015j = r14
            r0.f73018m = r3
            java.lang.Object r0 = r14.callAsync(r0)
            if (r0 != r1) goto L4e
            return r1
        L4e:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != 0) goto L80
            lb.b r1 = new lb.b
            int r2 = java.lang.Integer.parseInt(r13)
            java.lang.String r3 = r14.getIdPhoto1()
            java.lang.String r4 = r14.getUrlPhoto1()
            java.lang.String r5 = r14.getPseudoPhoto1()
            int r6 = r14.getNbVotes1()
            java.lang.String r7 = r14.getIdPhoto2()
            java.lang.String r8 = r14.getUrlPhoto2()
            java.lang.String r9 = r14.getPseudoPhoto2()
            int r10 = r14.getNbVotes2()
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r1
        L80:
            nb.b r13 = new nb.b
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.e.getDuelPhotoAsync(java.lang.String, zu.d):java.lang.Object");
    }

    public final lb.c getInstance() {
        return this.f72810i;
    }

    public final int getNbPertinentObjects() {
        return this.f72811j;
    }

    public final int getNbProposal() {
        return 1;
    }

    public final int getObjectForProposition(f fVar, boolean z10, boolean z11) {
        return ((Number) BuildersKt__BuildersKt.runBlocking$default(null, new x(this, fVar, z10, z11, null), 1, null)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getObjectForPropositionAsync(lb.e.f r8, boolean r9, boolean r10, zu.d<? super java.lang.Integer> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof lb.y
            if (r0 == 0) goto L13
            r0 = r11
            lb.y r0 = (lb.y) r0
            int r1 = r0.f73050m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f73050m = r1
            goto L18
        L13:
            lb.y r0 = new lb.y
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.f73048k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f73050m
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            qb.p r8 = r0.f73047j
            lb.e$f r9 = r0.f73046i
            tu.a0.throwOnFailure(r11)
            goto L78
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            tu.a0.throwOnFailure(r11)
            lb.s0$b r11 = lb.s0.f72971j
            lb.s0 r2 = r11.sharedInstance()
            lb.s0$c r2 = r2.getSettings()
            int r2 = r2.getMHauteurPhoto()
            r5 = -1
            if (r2 == r5) goto Ld3
            lb.s0 r11 = r11.sharedInstance()
            lb.s0$c r11 = r11.getSettings()
            int r11 = r11.getMLargeurPhoto()
            if (r11 == r5) goto Ld3
            if (r8 != 0) goto L5c
            goto Ld3
        L5c:
            qb.p r11 = new qb.p
            if (r10 == 0) goto L63
            r10 = 50
            goto L64
        L63:
            r10 = r4
        L64:
            r11.<init>(r7, r10, r3, r9)
            r0.f73046i = r8
            r0.f73047j = r11
            r0.f73050m = r4
            java.lang.Object r9 = r11.callAsync(r0)
            if (r9 != r1) goto L74
            return r1
        L74:
            r6 = r9
            r9 = r8
            r8 = r11
            r11 = r6
        L78:
            java.lang.Number r11 = (java.lang.Number) r11
            int r10 = r11.intValue()
            if (r10 != 0) goto Lce
            java.util.List r8 = r8.getLimuleObjects()
            java.lang.Object r8 = r8.get(r3)
            java.lang.String r11 = "null cannot be cast to non-null type com.elokence.limuleapi.Session.ProposedLimuleObject"
            kotlin.jvm.internal.e0.checkNotNull(r8, r11)
            lb.e$f r8 = (lb.e.f) r8
            int r11 = r8.getRankingLimit()
            r9.setRankingLimit(r11)
            boolean r11 = r8.isValidateConstraint()
            r9.setValideConstrait(r11)
            int r11 = r8.getIdSession()
            r9.setIdSession(r11)
            java.lang.String r11 = r8.getIdBase()
            r9.setIdBase(r11)
            java.lang.String r11 = r8.getDescription()
            r9.setDescription(r11)
            java.lang.String r11 = r8.getPicturePath()
            r9.setPicturePath(r11)
            java.lang.String r11 = r8.getName()
            r9.setName(r11)
            java.util.HashMap r11 = r8.getExtra()
            r9.setExtra(r11)
            int r8 = r8.getAwardId()
            r9.setAwardID(r8)
        Lce:
            java.lang.Integer r8 = bv.b.boxInt(r10)
            return r8
        Ld3:
            r8 = 100
            java.lang.Integer r8 = bv.b.boxInt(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.e.getObjectForPropositionAsync(lb.e$f, boolean, boolean, zu.d):java.lang.Object");
    }

    public final int getObjectsForQuestionWithListSize(int i10, ArrayList<b> arrayList) {
        return ((Number) BuildersKt__BuildersKt.runBlocking$default(null, new z(this, i10, arrayList, null), 1, null)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getObjectsForQuestionWithListSizeAsync(int r6, java.util.ArrayList<lb.e.b> r7, zu.d<? super java.lang.Integer> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof lb.a0
            if (r0 == 0) goto L13
            r0 = r8
            lb.a0 r0 = (lb.a0) r0
            int r1 = r0.f72725m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f72725m = r1
            goto L18
        L13:
            lb.a0 r0 = new lb.a0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f72723k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f72725m
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            qb.p r6 = r0.f72722j
            java.util.ArrayList r7 = r0.f72721i
            tu.a0.throwOnFailure(r8)
            goto L57
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            tu.a0.throwOnFailure(r8)
            if (r6 <= 0) goto L6d
            r8 = 50
            if (r6 > r8) goto L6d
            if (r7 != 0) goto L41
            goto L6d
        L41:
            qb.p r8 = new qb.p
            r2 = 0
            r8.<init>(r5, r6, r3, r2)
            r0.f72721i = r7
            r0.f72722j = r8
            r0.f72725m = r3
            java.lang.Object r6 = r8.callAsync(r0)
            if (r6 != r1) goto L54
            return r1
        L54:
            r4 = r8
            r8 = r6
            r6 = r4
        L57:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 != 0) goto L68
            java.util.List r6 = r6.getLimuleObjects()
            java.util.Collection r6 = (java.util.Collection) r6
            r7.addAll(r6)
        L68:
            java.lang.Integer r6 = bv.b.boxInt(r8)
            return r6
        L6d:
            r6 = 100
            java.lang.Integer r6 = bv.b.boxInt(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.e.getObjectsForQuestionWithListSizeAsync(int, java.util.ArrayList, zu.d):java.lang.Object");
    }

    public final int getObjectsFromString(String searchName, ArrayList<b> arrayList) {
        kotlin.jvm.internal.e0.checkNotNullParameter(searchName, "searchName");
        return ((Number) BuildersKt__BuildersKt.runBlocking$default(null, new b0(this, searchName, arrayList, null), 1, null)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getObjectsFromStringAsync(java.lang.String r6, java.util.ArrayList<lb.e.b> r7, zu.d<? super java.lang.Integer> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof lb.c0
            if (r0 == 0) goto L13
            r0 = r8
            lb.c0 r0 = (lb.c0) r0
            int r1 = r0.f72791m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f72791m = r1
            goto L18
        L13:
            lb.c0 r0 = new lb.c0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f72789k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f72791m
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            qb.x r6 = r0.f72788j
            java.util.ArrayList r7 = r0.f72787i
            tu.a0.throwOnFailure(r8)
            goto L61
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            tu.a0.throwOnFailure(r8)
            boolean r8 = r5.f72804c
            if (r8 != 0) goto L43
            r6 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r6 = bv.b.boxInt(r6)
            return r6
        L43:
            if (r7 != 0) goto L4c
            r6 = 400(0x190, float:5.6E-43)
            java.lang.Integer r6 = bv.b.boxInt(r6)
            return r6
        L4c:
            qb.x r8 = new qb.x
            r8.<init>(r5, r6)
            r0.f72787i = r7
            r0.f72788j = r8
            r0.f72791m = r3
            java.lang.Object r6 = r8.callAsync(r0)
            if (r6 != r1) goto L5e
            return r1
        L5e:
            r4 = r8
            r8 = r6
            r6 = r4
        L61:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 != 0) goto L70
            java.util.ArrayList r6 = r6.getListofLimuleObjects()
            r7.addAll(r6)
        L70:
            java.lang.Integer r6 = bv.b.boxInt(r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.e.getObjectsFromStringAsync(java.lang.String, java.util.ArrayList, zu.d):java.lang.Object");
    }

    public final int getObjectsWithListSize(int i10, ArrayList<f> arrayList) {
        return ((Number) BuildersKt__BuildersKt.runBlocking$default(null, new d0(this, i10, arrayList, null), 1, null)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getObjectsWithListSizeAsync(int r6, java.util.ArrayList<lb.e.f> r7, zu.d<? super java.lang.Integer> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof lb.e0
            if (r0 == 0) goto L13
            r0 = r8
            lb.e0 r0 = (lb.e0) r0
            int r1 = r0.f72856m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f72856m = r1
            goto L18
        L13:
            lb.e0 r0 = new lb.e0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f72854k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f72856m
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            qb.p r6 = r0.f72853j
            java.util.ArrayList r7 = r0.f72852i
            tu.a0.throwOnFailure(r8)
            goto L62
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            tu.a0.throwOnFailure(r8)
            if (r6 <= 0) goto L8e
            r8 = 50
            if (r6 > r8) goto L8e
            if (r7 != 0) goto L41
            goto L8e
        L41:
            boolean r8 = r5.f72804c
            if (r8 != 0) goto L4c
            r6 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r6 = bv.b.boxInt(r6)
            return r6
        L4c:
            qb.p r8 = new qb.p
            r2 = 0
            r8.<init>(r5, r6, r2, r2)
            r0.f72852i = r7
            r0.f72853j = r8
            r0.f72856m = r3
            java.lang.Object r6 = r8.callAsync(r0)
            if (r6 != r1) goto L5f
            return r1
        L5f:
            r4 = r8
            r8 = r6
            r6 = r4
        L62:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 != 0) goto L89
            java.util.List r6 = r6.getLimuleObjects()
            java.util.Iterator r6 = r6.iterator()
        L72:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L89
            java.lang.Object r0 = r6.next()
            lb.e$b r0 = (lb.e.b) r0
            java.lang.String r1 = "null cannot be cast to non-null type com.elokence.limuleapi.Session.ProposedLimuleObject"
            kotlin.jvm.internal.e0.checkNotNull(r0, r1)
            lb.e$f r0 = (lb.e.f) r0
            r7.add(r0)
            goto L72
        L89:
            java.lang.Integer r6 = bv.b.boxInt(r8)
            return r6
        L8e:
            r6 = 100
            java.lang.Integer r6 = bv.b.boxInt(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.e.getObjectsWithListSizeAsync(int, java.util.ArrayList, zu.d):java.lang.Object");
    }

    public final int getQuestionsFromString(String keyword, ArrayList<h> arrayList) {
        kotlin.jvm.internal.e0.checkNotNullParameter(keyword, "keyword");
        return ((Number) BuildersKt__BuildersKt.runBlocking$default(null, new f0(this, keyword, arrayList, null), 1, null)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getQuestionsFromStringAsync(java.lang.String r6, java.util.ArrayList<lb.e.h> r7, zu.d<? super java.lang.Integer> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof lb.g0
            if (r0 == 0) goto L13
            r0 = r8
            lb.g0 r0 = (lb.g0) r0
            int r1 = r0.f72875m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f72875m = r1
            goto L18
        L13:
            lb.g0 r0 = new lb.g0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f72873k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f72875m
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            qb.u r6 = r0.f72872j
            java.util.ArrayList r7 = r0.f72871i
            tu.a0.throwOnFailure(r8)
            goto L59
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            tu.a0.throwOnFailure(r8)
            if (r7 != 0) goto L41
            r6 = 100
            java.lang.Integer r6 = bv.b.boxInt(r6)
            return r6
        L41:
            r7.clear()
            qb.u r8 = new qb.u
            r8.<init>(r5, r6)
            r0.f72871i = r7
            r0.f72872j = r8
            r0.f72875m = r3
            java.lang.Object r6 = r8.callAsync(r0)
            if (r6 != r1) goto L56
            return r1
        L56:
            r4 = r8
            r8 = r6
            r6 = r4
        L59:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 != 0) goto L68
            java.util.ArrayList r6 = r6.getListOfQuestions()
            r7.addAll(r6)
        L68:
            java.lang.Integer r6 = bv.b.boxInt(r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.e.getQuestionsFromStringAsync(java.lang.String, java.util.ArrayList, zu.d):java.lang.Object");
    }

    public final List<lb.d> getQuestionsToAsk(String objectId) throws nb.b {
        kotlin.jvm.internal.e0.checkNotNullParameter(objectId, "objectId");
        qb.o oVar = new qb.o(this, objectId);
        if (oVar.call() == 0) {
            return oVar.getListQuestions();
        }
        throw new nb.b();
    }

    public final int getReport(ArrayList<C0742e> report) {
        kotlin.jvm.internal.e0.checkNotNullParameter(report, "report");
        return ((Number) BuildersKt__BuildersKt.runBlocking$default(null, new h0(this, report, null), 1, null)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getReportAsync(java.util.ArrayList<lb.e.C0742e> r6, zu.d<? super java.lang.Integer> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof lb.i0
            if (r0 == 0) goto L13
            r0 = r7
            lb.i0 r0 = (lb.i0) r0
            int r1 = r0.f72892m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f72892m = r1
            goto L18
        L13:
            lb.i0 r0 = new lb.i0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f72890k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f72892m
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            qb.s r6 = r0.f72889j
            java.util.ArrayList r0 = r0.f72888i
            tu.a0.throwOnFailure(r7)
            goto L59
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            tu.a0.throwOnFailure(r7)
            boolean r7 = r5.f72804c
            if (r7 == 0) goto L43
            r6 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r6 = bv.b.boxInt(r6)
            return r6
        L43:
            qb.s r7 = new qb.s
            r7.<init>(r5)
            r0.f72888i = r6
            r0.f72889j = r7
            r0.f72892m = r3
            java.lang.Object r0 = r7.callAsync(r0)
            if (r0 != r1) goto L55
            return r1
        L55:
            r4 = r0
            r0 = r6
            r6 = r7
            r7 = r4
        L59:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r7 != 0) goto L68
            java.util.ArrayList r6 = r6.getReport()
            r0.addAll(r6)
        L68:
            java.lang.Integer r6 = bv.b.boxInt(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.e.getReportAsync(java.util.ArrayList, zu.d):java.lang.Object");
    }

    public final String getSession() {
        return this.f72806e;
    }

    public final String getSignature() {
        return this.f72807f;
    }

    public final void handleWSCallCompleted$limuleapi_release(qb.z akWS) {
        kotlin.jvm.internal.e0.checkNotNullParameter(akWS, "akWS");
        if (akWS instanceof qb.d) {
            qb.d dVar = (qb.d) akWS;
            updateSessionState(dVar.getQuestion(), dVar.getAnswers(), dVar.getStep(), dVar.getProgression(), dVar.getTrouvitudes(), dVar.getExtra());
            if (this.f72802a) {
                ArrayList<String> probaAnswers = dVar.getProbaAnswers();
                kotlin.jvm.internal.e0.checkNotNull(probaAnswers);
                updateSessionReverseMode(probaAnswers);
                return;
            }
            return;
        }
        if (akWS instanceof qb.e) {
            qb.e eVar = (qb.e) akWS;
            updateSessionState(eVar.getQuestion(), eVar.getAnswers(), eVar.getStep(), eVar.getProgression(), eVar.getTrouvitudes(), eVar.getExtra());
            return;
        }
        if (akWS instanceof qb.h) {
            this.f72804c = false;
            return;
        }
        if (akWS instanceof qb.p) {
            this.f72811j = ((qb.p) akWS).getNbObjetsPertinents();
            return;
        }
        if (akWS instanceof qb.w) {
            this.f72804c = false;
        } else if (akWS instanceof qb.q) {
            this.f72804c = false;
        } else if (akWS instanceof qb.f) {
            this.f72804c = false;
        }
    }

    public final boolean hasPriority() {
        return this.f72803b;
    }

    public final boolean isActive() {
        return this.f72804c;
    }

    public final boolean isChildProtected() {
        return this.f72812k || this.f72813l;
    }

    public final boolean isReverseModeActivited() {
        return this.f72802a;
    }

    public final int modifyQuestionWithId(int i10, String str, ArrayList<d> arrayList) {
        return ((Number) BuildersKt__BuildersKt.runBlocking$default(null, new j0(this, i10, str, arrayList, null), 1, null)).intValue();
    }

    public final Object modifyQuestionWithIdAsync(int i10, String str, ArrayList<d> arrayList, zu.d<? super Integer> dVar) {
        if (i10 < 0 || str == null || kotlin.jvm.internal.e0.areEqual(str, "") || arrayList == null) {
            return bv.b.boxInt(100);
        }
        qb.c cVar = new qb.c(this, str, arrayList);
        cVar.setQuestionId(i10);
        return cVar.callAsync(dVar);
    }

    public final int newElementWithNameAndDescription(String str, String str2) {
        return ((Number) BuildersKt__BuildersKt.runBlocking$default(null, new k0(this, str, str2, null), 1, null)).intValue();
    }

    public final Object newElementWithNameAndDescriptionAsync(String str, String str2, zu.d<? super Integer> dVar) {
        return (str == null || str.length() == 0) ? bv.b.boxInt(100) : (str2 == null || str2.length() == 0) ? bv.b.boxInt(100) : !this.f72804c ? bv.b.boxInt(200) : new qb.q(this, str, str2).callAsync(dVar);
    }

    public final int reportDuplicatesWithArray(ArrayList<String> idsBase, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(idsBase, "idsBase");
        return ((Number) BuildersKt__BuildersKt.runBlocking$default(null, new l0(this, idsBase, z10, null), 1, null)).intValue();
    }

    public final Object reportDuplicatesWithArrayAsync(ArrayList<String> arrayList, boolean z10, zu.d<? super Integer> dVar) {
        return !this.f72804c ? bv.b.boxInt(200) : new qb.v(this, arrayList, z10).callAsync(dVar);
    }

    public final void reset$limuleapi_release() {
        updateSessionState(null, null, -1, -1.0f, null, null);
    }

    public final int sendTraceStatsMultiplayerGame(int i10, String objectId, int i11, boolean z10, int i12) {
        kotlin.jvm.internal.e0.checkNotNullParameter(objectId, "objectId");
        return new qb.y(this, i10, objectId, i11, z10, i12).call();
    }

    public final void setActive(boolean z10) {
        this.f72804c = z10;
    }

    public final int soundlikeAcceptanceObjectAtIndex(int i10) {
        return ((Number) BuildersKt__BuildersKt.runBlocking$default(null, new m0(this, i10, null), 1, null)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object soundlikeAcceptanceObjectAtIndexAsync(int r5, zu.d<? super java.lang.Integer> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof lb.n0
            if (r0 == 0) goto L13
            r0 = r6
            lb.n0 r0 = (lb.n0) r0
            int r1 = r0.f72931l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f72931l = r1
            goto L18
        L13:
            lb.n0 r0 = new lb.n0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f72929j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f72931l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            lb.e r5 = r0.f72928i
            tu.a0.throwOnFailure(r6)
            goto L52
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            tu.a0.throwOnFailure(r6)
            boolean r6 = r4.f72804c
            if (r6 != 0) goto L41
            r5 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r5 = bv.b.boxInt(r5)
            return r5
        L41:
            qb.w r6 = new qb.w
            r6.<init>(r4, r5)
            r0.f72928i = r4
            r0.f72931l = r3
            java.lang.Object r6 = r6.callAsync(r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            r5 = r4
        L52:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 != 0) goto L5d
            r0 = 0
            r5.f72804c = r0
        L5d:
            java.lang.Integer r5 = bv.b.boxInt(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.e.soundlikeAcceptanceObjectAtIndexAsync(int, zu.d):java.lang.Object");
    }

    public final void updateSessionReverseMode(ArrayList<String> arrayList) {
        i iVar = this.f72814m;
        kotlin.jvm.internal.e0.checkNotNull(iVar);
        iVar.setProbaAnswers$limuleapi_release(arrayList);
    }

    public final void updateSessionState(String str, ArrayList<d> arrayList, int i10, float f10, ArrayList<Float> arrayList2, HashMap<String, String> map) {
        i iVar = this.f72814m;
        kotlin.jvm.internal.e0.checkNotNull(iVar);
        iVar.setQuestion(str);
        iVar.setStep(i10);
        iVar.setProgression(f10);
        iVar.setAnswers$limuleapi_release(arrayList);
        iVar.setExtra$limuleapi_release(map);
        iVar.setTrouvitudes(arrayList2);
    }

    public final int validateObjectWithCategorieId(int i10, c cVar) {
        return ((Number) BuildersKt__BuildersKt.runBlocking$default(null, new p0(this, i10, cVar, null), 1, null)).intValue();
    }

    public final Object validateObjectWithCategorieIdAsync(int i10, c cVar, zu.d<? super Integer> dVar) {
        return b(i10, false, true, null, cVar, dVar);
    }

    public final int validateObjectWithId(int i10, c cVar) {
        return ((Number) BuildersKt__BuildersKt.runBlocking$default(null, new q0(this, i10, cVar, null), 1, null)).intValue();
    }

    public final Object validateObjectWithIdAsync(int i10, c cVar, zu.d<? super Integer> dVar) {
        return b(i10, false, false, null, cVar, dVar);
    }

    public final int validateObjectWithIdWithJackpot(int i10, String str, c cVar) {
        return ((Number) BuildersKt__BuildersKt.runBlocking$default(null, new r0(this, i10, str, cVar, null), 1, null)).intValue();
    }

    public final int voteForDuelPhoto(String objectId, String photoId) {
        kotlin.jvm.internal.e0.checkNotNullParameter(objectId, "objectId");
        kotlin.jvm.internal.e0.checkNotNullParameter(photoId, "photoId");
        return new qb.k(this, objectId, photoId).call();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g extends f {

        /* renamed from: l, reason: collision with root package name */
        public boolean f72839l;

        /* renamed from: m, reason: collision with root package name */
        public int f72840m;

        /* renamed from: n, reason: collision with root package name */
        public int f72841n;

        public g() {
            this.f72840m = -1;
        }

        public final int getElementMinibaseId() {
            return this.f72840m;
        }

        public final int getNbPlayed() {
            return this.f72841n;
        }

        public final boolean isMyWorldAddable() {
            return this.f72839l;
        }

        public final void setElementMinibaseId(int i10) {
            this.f72840m = i10;
        }

        public final void setMyWorldAddable(boolean z10) {
            this.f72839l = z10;
        }

        public final void setNbPlayed(int i10) {
            this.f72841n = i10;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String idBase, String name, String description, int i10, String str, boolean z10, int i11, boolean z11, int i12) {
            super(idBase, name, description, i10, str, z10, i11);
            kotlin.jvm.internal.e0.checkNotNullParameter(idBase, "idBase");
            kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.e0.checkNotNullParameter(description, "description");
            this.f72839l = z11;
            this.f72840m = i12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object answerQuestionWithTagAsync(int r7, lb.e.i r8, zu.d<? super java.lang.Integer> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof lb.i
            if (r0 == 0) goto L13
            r0 = r9
            lb.i r0 = (lb.i) r0
            int r1 = r0.f72887n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f72887n = r1
            goto L18
        L13:
            lb.i r0 = new lb.i
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f72885l
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f72887n
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            long r7 = r0.f72884k
            lb.e$i r1 = r0.f72883j
            lb.e r0 = r0.f72882i
            tu.a0.throwOnFailure(r9)
            goto L6a
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            tu.a0.throwOnFailure(r9)
            if (r8 != 0) goto L43
            r7 = 100
            java.lang.Integer r7 = bv.b.boxInt(r7)
            return r7
        L43:
            lb.e$i r9 = r6.f72814m
            if (r9 != 0) goto L4e
            r7 = 400(0x190, float:5.6E-43)
            java.lang.Integer r7 = bv.b.boxInt(r7)
            return r7
        L4e:
            long r4 = java.lang.System.currentTimeMillis()
            qb.d r9 = new qb.d
            r2 = 0
            r9.<init>(r6, r7, r2)
            r0.f72882i = r6
            r0.f72883j = r8
            r0.f72884k = r4
            r0.f72887n = r3
            java.lang.Object r9 = r9.callAsync(r0)
            if (r9 != r1) goto L67
            return r1
        L67:
            r0 = r6
            r1 = r8
            r7 = r4
        L6a:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            long r2 = java.lang.System.currentTimeMillis()
            if (r9 != 0) goto La9
            lb.e$i r4 = r0.f72814m
            int r5 = r4.getStep()
            r1.setStep(r5)
            java.lang.String r5 = r4.getQuestion()
            r1.setQuestion(r5)
            float r5 = r4.getProgression()
            r1.setProgression(r5)
            java.util.ArrayList r5 = r4.getAnswers()
            r1.setAnswers$limuleapi_release(r5)
            java.util.HashMap r5 = r4.getExtra()
            r1.setExtra$limuleapi_release(r5)
            java.util.ArrayList r5 = r4.getProbaAnswers()
            r1.setProbaAnswers$limuleapi_release(r5)
            java.util.ArrayList r4 = r4.getTrouvitudes()
            r1.setTrouvitudes(r4)
        La9:
            long r2 = r2 - r7
            r0.getClass()
            a(r2)
            java.lang.Integer r7 = bv.b.boxInt(r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.e.answerQuestionWithTagAsync(int, lb.e$i, zu.d):java.lang.Object");
    }

    public final int excludeProposition() {
        return ((Number) BuildersKt__BuildersKt.runBlocking$default(null, new s(this, null), 1, null)).intValue();
    }

    public final int getObjectForProposition(f fVar, boolean z10) {
        return getObjectForProposition(fVar, z10, false);
    }

    public final int getObjectForProposition(f fVar) {
        return getObjectForProposition(fVar, false);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public String f72815b;

        /* renamed from: c, reason: collision with root package name */
        public String f72816c;

        /* renamed from: e, reason: collision with root package name */
        public String f72817e;

        /* renamed from: f, reason: collision with root package name */
        public String f72818f;

        /* renamed from: g, reason: collision with root package name */
        public int f72819g;

        /* renamed from: h, reason: collision with root package name */
        public HashMap f72820h;

        public b() {
            this.f72815b = "";
            this.f72816c = "";
            this.f72817e = "";
            this.f72819g = -1;
        }

        public final void addExtra(String str, String str2) {
            if (this.f72820h == null) {
                this.f72820h = new HashMap();
            }
            HashMap map = this.f72820h;
            kotlin.jvm.internal.e0.checkNotNull(map);
            map.put(str, str2);
        }

        public final int getAwardId() {
            return this.f72819g;
        }

        public final String getDescription() {
            return this.f72817e;
        }

        public final HashMap<String, String> getExtra() {
            return this.f72820h;
        }

        public final String getIdBase() {
            return this.f72815b;
        }

        public final String getName() {
            return this.f72816c;
        }

        public final String getPicturePath() {
            return this.f72818f;
        }

        public final void setAwardID(int i10) {
            this.f72819g = i10;
        }

        public final void setDescription(String str) {
            kotlin.jvm.internal.e0.checkNotNullParameter(str, "<set-?>");
            this.f72817e = str;
        }

        public final void setExtra(HashMap<String, String> map) {
            this.f72820h = map;
        }

        public final void setIdBase(String str) {
            kotlin.jvm.internal.e0.checkNotNullParameter(str, "<set-?>");
            this.f72815b = str;
        }

        public final void setName(String str) {
            kotlin.jvm.internal.e0.checkNotNullParameter(str, "<set-?>");
            this.f72816c = str;
        }

        public final void setPicturePath(String str) {
            this.f72818f = str;
        }

        public b(String idBase, String name, String description) {
            kotlin.jvm.internal.e0.checkNotNullParameter(idBase, "idBase");
            kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.e0.checkNotNullParameter(description, "description");
            this.f72819g = -1;
            this.f72815b = idBase;
            this.f72816c = name;
            this.f72817e = description;
        }

        public b(String idBase, String name, String description, String str) {
            kotlin.jvm.internal.e0.checkNotNullParameter(idBase, "idBase");
            kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.e0.checkNotNullParameter(description, "description");
            this.f72819g = -1;
            this.f72815b = idBase;
            this.f72816c = name;
            this.f72817e = description;
            this.f72818f = str;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: lb.e$e, reason: collision with other inner class name */
    public static final class C0742e implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public String f72831b;

        /* renamed from: c, reason: collision with root package name */
        public String f72832c;

        /* renamed from: f, reason: collision with root package name */
        public String f72834f;

        /* renamed from: e, reason: collision with root package name */
        public int f72833e = -1;

        /* renamed from: g, reason: collision with root package name */
        public int f72835g = -1;

        public C0742e(String str, String str2, String str3) {
            this.f72831b = str;
            this.f72834f = str3;
        }

        public final String getExpectedAnswer() {
            return this.f72834f;
        }

        public final String getGivenAnswer() {
            return this.f72832c;
        }

        public final int getGroupeExpectedAnswer() {
            return this.f72835g;
        }

        public final int getGroupeGivenAnswer() {
            return this.f72833e;
        }

        public final String getQuestionLabel() {
            return this.f72831b;
        }

        public final void setAnswerExpected(String str) {
            this.f72834f = str;
        }

        public final void setGivenAnswer(String str) {
            this.f72832c = str;
        }

        public final void setGroupeExpectedAnswer(int i10) {
            this.f72835g = i10;
        }

        public final void setGroupeGivenAnswer(int i10) {
            this.f72833e = i10;
        }

        public final void setQuestionLabel(String str) {
            this.f72831b = str;
        }

        public C0742e() {
        }
    }

    public e(lb.c instance, String baseURL, String channel, String session, String signature, String challengeAuth, boolean z10, boolean z11, boolean z12) {
        kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
        kotlin.jvm.internal.e0.checkNotNullParameter(baseURL, "baseURL");
        kotlin.jvm.internal.e0.checkNotNullParameter(channel, "channel");
        kotlin.jvm.internal.e0.checkNotNullParameter(session, "session");
        kotlin.jvm.internal.e0.checkNotNullParameter(signature, "signature");
        kotlin.jvm.internal.e0.checkNotNullParameter(challengeAuth, "challengeAuth");
        this.f72805d = "";
        this.f72806e = "";
        this.f72807f = "";
        this.f72808g = "";
        this.f72809h = "";
        this.f72812k = true;
        this.f72813l = true;
        this.f72814m = new i();
        this.f72810i = instance;
        this.f72809h = baseURL;
        this.f72805d = channel;
        this.f72806e = session;
        this.f72807f = signature;
        this.f72808g = challengeAuth;
        this.f72802a = z12;
        this.f72803b = z10;
        this.f72812k = z11;
        this.f72813l = false;
    }
}
