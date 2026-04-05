package com.unity3d.services.core.domain.task;

import bv.f;
import bv.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.x0;
import tu.z;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.services.core.domain.task.InitializeSDK$doWork$2", f = "InitializeSDK.kt", i = {0, 1, 2, 2, 3, 4, 4, 5, 5, 5, 6, 6, 6, 7, 8, 9, 9, 10, 11}, l = {48, 53, 58, 60, TokenParametersOuterClass$TokenParameters.MOCKRESPONSEID_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.IGNITEVERSION_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.ODT_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER, TsExtractor.TS_STREAM_TYPE_DVBSUBS, 92, 100, 103, 106}, m = "invokeSuspend", n = {"$this$withContext", "$this$withContext", "$this$withContext", "configuration", "resetResult", "$this$withContext", "configuration", "$this$withContext", "configuration", "configResult", "$this$withContext", "configuration", "configResult", "loadCacheResult", "configResult", "configResult", "loadWebResult", "configResult", "configResult"}, s = {"L$0", "L$0", "L$0", "L$2", "L$0", "L$0", "L$2", "L$0", "L$2", "L$3", "L$0", "L$2", "L$3", "L$0", "L$1", "L$1", "L$2", "L$1", "L$1"})
/* loaded from: classes8.dex */
public final class InitializeSDK$doWork$2 extends n implements p {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InitializeSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeSDK$doWork$2(InitializeSDK initializeSDK, d<? super InitializeSDK$doWork$2> dVar) {
        super(2, dVar);
        this.this$0 = initializeSDK;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        InitializeSDK$doWork$2 initializeSDK$doWork$2 = new InitializeSDK$doWork$2(this.this$0, dVar);
        initializeSDK$doWork$2.L$0 = obj;
        return initializeSDK$doWork$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x035d, code lost:
    
        if (r14 != r2) goto L132;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0281 A[Catch: all -> 0x0022, CancellationException -> 0x0026, TryCatch #2 {CancellationException -> 0x0026, all -> 0x0022, blocks: (B:6:0x0017, B:132:0x0360, B:13:0x0030, B:129:0x0343, B:16:0x003b, B:124:0x032a, B:126:0x0330, B:19:0x004e, B:117:0x02f3, B:120:0x0304, B:22:0x0059, B:112:0x02d7, B:114:0x02dd, B:25:0x0069, B:97:0x026f, B:99:0x0275, B:100:0x0280, B:28:0x0081, B:92:0x024f, B:94:0x0255, B:101:0x0281, B:103:0x028c, B:105:0x0296, B:107:0x029c, B:108:0x02b3, B:118:0x02fe, B:133:0x036a, B:134:0x0371, B:31:0x009e, B:89:0x022d, B:34:0x00af, B:84:0x0210, B:86:0x0216, B:37:0x00c0, B:76:0x01e1, B:78:0x01e7, B:79:0x01f2, B:40:0x00d6, B:71:0x01c4, B:73:0x01ca, B:80:0x01f3, B:43:0x00ec, B:62:0x0182, B:64:0x0188, B:65:0x019b, B:68:0x01a7, B:46:0x00ff, B:58:0x0162, B:49:0x010d, B:51:0x012a, B:53:0x0130), top: B:145:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02dd A[Catch: all -> 0x0022, CancellationException -> 0x0026, TryCatch #2 {CancellationException -> 0x0026, all -> 0x0022, blocks: (B:6:0x0017, B:132:0x0360, B:13:0x0030, B:129:0x0343, B:16:0x003b, B:124:0x032a, B:126:0x0330, B:19:0x004e, B:117:0x02f3, B:120:0x0304, B:22:0x0059, B:112:0x02d7, B:114:0x02dd, B:25:0x0069, B:97:0x026f, B:99:0x0275, B:100:0x0280, B:28:0x0081, B:92:0x024f, B:94:0x0255, B:101:0x0281, B:103:0x028c, B:105:0x0296, B:107:0x029c, B:108:0x02b3, B:118:0x02fe, B:133:0x036a, B:134:0x0371, B:31:0x009e, B:89:0x022d, B:34:0x00af, B:84:0x0210, B:86:0x0216, B:37:0x00c0, B:76:0x01e1, B:78:0x01e7, B:79:0x01f2, B:40:0x00d6, B:71:0x01c4, B:73:0x01ca, B:80:0x01f3, B:43:0x00ec, B:62:0x0182, B:64:0x0188, B:65:0x019b, B:68:0x01a7, B:46:0x00ff, B:58:0x0162, B:49:0x010d, B:51:0x012a, B:53:0x0130), top: B:145:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0330 A[Catch: all -> 0x0022, CancellationException -> 0x0026, TryCatch #2 {CancellationException -> 0x0026, all -> 0x0022, blocks: (B:6:0x0017, B:132:0x0360, B:13:0x0030, B:129:0x0343, B:16:0x003b, B:124:0x032a, B:126:0x0330, B:19:0x004e, B:117:0x02f3, B:120:0x0304, B:22:0x0059, B:112:0x02d7, B:114:0x02dd, B:25:0x0069, B:97:0x026f, B:99:0x0275, B:100:0x0280, B:28:0x0081, B:92:0x024f, B:94:0x0255, B:101:0x0281, B:103:0x028c, B:105:0x0296, B:107:0x029c, B:108:0x02b3, B:118:0x02fe, B:133:0x036a, B:134:0x0371, B:31:0x009e, B:89:0x022d, B:34:0x00af, B:84:0x0210, B:86:0x0216, B:37:0x00c0, B:76:0x01e1, B:78:0x01e7, B:79:0x01f2, B:40:0x00d6, B:71:0x01c4, B:73:0x01ca, B:80:0x01f3, B:43:0x00ec, B:62:0x0182, B:64:0x0188, B:65:0x019b, B:68:0x01a7, B:46:0x00ff, B:58:0x0162, B:49:0x010d, B:51:0x012a, B:53:0x0130), top: B:145:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0343 A[Catch: all -> 0x0022, CancellationException -> 0x0026, PHI: r0 r1
      0x0343: PHI (r0v53 java.lang.Object) = (r0v51 java.lang.Object), (r0v51 java.lang.Object), (r0v56 java.lang.Object) binds: [B:125:0x032e, B:127:0x0340, B:13:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x0343: PHI (r1v48 com.unity3d.services.core.domain.task.InitializeSDK) = 
      (r1v45 com.unity3d.services.core.domain.task.InitializeSDK)
      (r1v45 com.unity3d.services.core.domain.task.InitializeSDK)
      (r1v51 com.unity3d.services.core.domain.task.InitializeSDK)
     binds: [B:125:0x032e, B:127:0x0340, B:13:0x0030] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0026, all -> 0x0022, blocks: (B:6:0x0017, B:132:0x0360, B:13:0x0030, B:129:0x0343, B:16:0x003b, B:124:0x032a, B:126:0x0330, B:19:0x004e, B:117:0x02f3, B:120:0x0304, B:22:0x0059, B:112:0x02d7, B:114:0x02dd, B:25:0x0069, B:97:0x026f, B:99:0x0275, B:100:0x0280, B:28:0x0081, B:92:0x024f, B:94:0x0255, B:101:0x0281, B:103:0x028c, B:105:0x0296, B:107:0x029c, B:108:0x02b3, B:118:0x02fe, B:133:0x036a, B:134:0x0371, B:31:0x009e, B:89:0x022d, B:34:0x00af, B:84:0x0210, B:86:0x0216, B:37:0x00c0, B:76:0x01e1, B:78:0x01e7, B:79:0x01f2, B:40:0x00d6, B:71:0x01c4, B:73:0x01ca, B:80:0x01f3, B:43:0x00ec, B:62:0x0182, B:64:0x0188, B:65:0x019b, B:68:0x01a7, B:46:0x00ff, B:58:0x0162, B:49:0x010d, B:51:0x012a, B:53:0x0130), top: B:145:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a A[PHI: r0 r1 r3 r4 r14
      0x008a: PHI (r0v27 java.lang.Object) = (r0v25 java.lang.Object), (r0v35 java.lang.Object) binds: [B:90:0x024b, B:28:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x008a: PHI (r1v27 com.unity3d.services.core.configuration.Configuration) = 
      (r1v24 com.unity3d.services.core.configuration.Configuration)
      (r1v35 com.unity3d.services.core.configuration.Configuration)
     binds: [B:90:0x024b, B:28:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x008a: PHI (r3v22 com.unity3d.services.core.domain.task.InitializeSDK) = 
      (r3v19 com.unity3d.services.core.domain.task.InitializeSDK)
      (r3v24 com.unity3d.services.core.domain.task.InitializeSDK)
     binds: [B:90:0x024b, B:28:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x008a: PHI (r4v14 kotlinx.coroutines.CoroutineScope) = (r4v11 kotlinx.coroutines.CoroutineScope), (r4v22 kotlinx.coroutines.CoroutineScope) binds: [B:90:0x024b, B:28:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x008a: PHI (r14v38 java.lang.Object) = (r14v37 java.lang.Object), (r14v44 java.lang.Object) binds: [B:90:0x024b, B:28:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00df A[PHI: r0 r1 r3 r14
      0x00df: PHI (r0v11 com.unity3d.services.core.configuration.Configuration) = 
      (r0v8 com.unity3d.services.core.configuration.Configuration)
      (r0v16 com.unity3d.services.core.configuration.Configuration)
     binds: [B:69:0x01c0, B:40:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x00df: PHI (r1v16 com.unity3d.services.core.domain.task.InitializeSDK) = 
      (r1v13 com.unity3d.services.core.domain.task.InitializeSDK)
      (r1v19 com.unity3d.services.core.domain.task.InitializeSDK)
     binds: [B:69:0x01c0, B:40:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x00df: PHI (r3v10 kotlinx.coroutines.CoroutineScope) = (r3v7 kotlinx.coroutines.CoroutineScope), (r3v14 kotlinx.coroutines.CoroutineScope) binds: [B:69:0x01c0, B:40:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x00df: PHI (r14v23 java.lang.Object) = (r14v19 java.lang.Object), (r14v27 java.lang.Object) binds: [B:69:0x01c0, B:40:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0188 A[Catch: all -> 0x0022, CancellationException -> 0x0026, TryCatch #2 {CancellationException -> 0x0026, all -> 0x0022, blocks: (B:6:0x0017, B:132:0x0360, B:13:0x0030, B:129:0x0343, B:16:0x003b, B:124:0x032a, B:126:0x0330, B:19:0x004e, B:117:0x02f3, B:120:0x0304, B:22:0x0059, B:112:0x02d7, B:114:0x02dd, B:25:0x0069, B:97:0x026f, B:99:0x0275, B:100:0x0280, B:28:0x0081, B:92:0x024f, B:94:0x0255, B:101:0x0281, B:103:0x028c, B:105:0x0296, B:107:0x029c, B:108:0x02b3, B:118:0x02fe, B:133:0x036a, B:134:0x0371, B:31:0x009e, B:89:0x022d, B:34:0x00af, B:84:0x0210, B:86:0x0216, B:37:0x00c0, B:76:0x01e1, B:78:0x01e7, B:79:0x01f2, B:40:0x00d6, B:71:0x01c4, B:73:0x01ca, B:80:0x01f3, B:43:0x00ec, B:62:0x0182, B:64:0x0188, B:65:0x019b, B:68:0x01a7, B:46:0x00ff, B:58:0x0162, B:49:0x010d, B:51:0x012a, B:53:0x0130), top: B:145:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ca A[Catch: all -> 0x0022, CancellationException -> 0x0026, TryCatch #2 {CancellationException -> 0x0026, all -> 0x0022, blocks: (B:6:0x0017, B:132:0x0360, B:13:0x0030, B:129:0x0343, B:16:0x003b, B:124:0x032a, B:126:0x0330, B:19:0x004e, B:117:0x02f3, B:120:0x0304, B:22:0x0059, B:112:0x02d7, B:114:0x02dd, B:25:0x0069, B:97:0x026f, B:99:0x0275, B:100:0x0280, B:28:0x0081, B:92:0x024f, B:94:0x0255, B:101:0x0281, B:103:0x028c, B:105:0x0296, B:107:0x029c, B:108:0x02b3, B:118:0x02fe, B:133:0x036a, B:134:0x0371, B:31:0x009e, B:89:0x022d, B:34:0x00af, B:84:0x0210, B:86:0x0216, B:37:0x00c0, B:76:0x01e1, B:78:0x01e7, B:79:0x01f2, B:40:0x00d6, B:71:0x01c4, B:73:0x01ca, B:80:0x01f3, B:43:0x00ec, B:62:0x0182, B:64:0x0188, B:65:0x019b, B:68:0x01a7, B:46:0x00ff, B:58:0x0162, B:49:0x010d, B:51:0x012a, B:53:0x0130), top: B:145:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e7 A[Catch: all -> 0x0022, CancellationException -> 0x0026, TryCatch #2 {CancellationException -> 0x0026, all -> 0x0022, blocks: (B:6:0x0017, B:132:0x0360, B:13:0x0030, B:129:0x0343, B:16:0x003b, B:124:0x032a, B:126:0x0330, B:19:0x004e, B:117:0x02f3, B:120:0x0304, B:22:0x0059, B:112:0x02d7, B:114:0x02dd, B:25:0x0069, B:97:0x026f, B:99:0x0275, B:100:0x0280, B:28:0x0081, B:92:0x024f, B:94:0x0255, B:101:0x0281, B:103:0x028c, B:105:0x0296, B:107:0x029c, B:108:0x02b3, B:118:0x02fe, B:133:0x036a, B:134:0x0371, B:31:0x009e, B:89:0x022d, B:34:0x00af, B:84:0x0210, B:86:0x0216, B:37:0x00c0, B:76:0x01e1, B:78:0x01e7, B:79:0x01f2, B:40:0x00d6, B:71:0x01c4, B:73:0x01ca, B:80:0x01f3, B:43:0x00ec, B:62:0x0182, B:64:0x0188, B:65:0x019b, B:68:0x01a7, B:46:0x00ff, B:58:0x0162, B:49:0x010d, B:51:0x012a, B:53:0x0130), top: B:145:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f3 A[Catch: all -> 0x0022, CancellationException -> 0x0026, TryCatch #2 {CancellationException -> 0x0026, all -> 0x0022, blocks: (B:6:0x0017, B:132:0x0360, B:13:0x0030, B:129:0x0343, B:16:0x003b, B:124:0x032a, B:126:0x0330, B:19:0x004e, B:117:0x02f3, B:120:0x0304, B:22:0x0059, B:112:0x02d7, B:114:0x02dd, B:25:0x0069, B:97:0x026f, B:99:0x0275, B:100:0x0280, B:28:0x0081, B:92:0x024f, B:94:0x0255, B:101:0x0281, B:103:0x028c, B:105:0x0296, B:107:0x029c, B:108:0x02b3, B:118:0x02fe, B:133:0x036a, B:134:0x0371, B:31:0x009e, B:89:0x022d, B:34:0x00af, B:84:0x0210, B:86:0x0216, B:37:0x00c0, B:76:0x01e1, B:78:0x01e7, B:79:0x01f2, B:40:0x00d6, B:71:0x01c4, B:73:0x01ca, B:80:0x01f3, B:43:0x00ec, B:62:0x0182, B:64:0x0188, B:65:0x019b, B:68:0x01a7, B:46:0x00ff, B:58:0x0162, B:49:0x010d, B:51:0x012a, B:53:0x0130), top: B:145:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0216 A[Catch: all -> 0x0022, CancellationException -> 0x0026, TryCatch #2 {CancellationException -> 0x0026, all -> 0x0022, blocks: (B:6:0x0017, B:132:0x0360, B:13:0x0030, B:129:0x0343, B:16:0x003b, B:124:0x032a, B:126:0x0330, B:19:0x004e, B:117:0x02f3, B:120:0x0304, B:22:0x0059, B:112:0x02d7, B:114:0x02dd, B:25:0x0069, B:97:0x026f, B:99:0x0275, B:100:0x0280, B:28:0x0081, B:92:0x024f, B:94:0x0255, B:101:0x0281, B:103:0x028c, B:105:0x0296, B:107:0x029c, B:108:0x02b3, B:118:0x02fe, B:133:0x036a, B:134:0x0371, B:31:0x009e, B:89:0x022d, B:34:0x00af, B:84:0x0210, B:86:0x0216, B:37:0x00c0, B:76:0x01e1, B:78:0x01e7, B:79:0x01f2, B:40:0x00d6, B:71:0x01c4, B:73:0x01ca, B:80:0x01f3, B:43:0x00ec, B:62:0x0182, B:64:0x0188, B:65:0x019b, B:68:0x01a7, B:46:0x00ff, B:58:0x0162, B:49:0x010d, B:51:0x012a, B:53:0x0130), top: B:145:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022d A[Catch: all -> 0x0022, CancellationException -> 0x0026, PHI: r0 r1 r3 r4
      0x022d: PHI (r0v25 java.lang.Object) = (r0v21 java.lang.Object), (r0v21 java.lang.Object), (r0v26 java.lang.Object) binds: [B:85:0x0214, B:87:0x0229, B:31:0x009e] A[DONT_GENERATE, DONT_INLINE]
      0x022d: PHI (r1v24 com.unity3d.services.core.configuration.Configuration) = 
      (r1v20 com.unity3d.services.core.configuration.Configuration)
      (r1v20 com.unity3d.services.core.configuration.Configuration)
      (r1v26 com.unity3d.services.core.configuration.Configuration)
     binds: [B:85:0x0214, B:87:0x0229, B:31:0x009e] A[DONT_GENERATE, DONT_INLINE]
      0x022d: PHI (r3v19 com.unity3d.services.core.domain.task.InitializeSDK) = 
      (r3v15 com.unity3d.services.core.domain.task.InitializeSDK)
      (r3v15 com.unity3d.services.core.domain.task.InitializeSDK)
      (r3v21 com.unity3d.services.core.domain.task.InitializeSDK)
     binds: [B:85:0x0214, B:87:0x0229, B:31:0x009e] A[DONT_GENERATE, DONT_INLINE]
      0x022d: PHI (r4v11 kotlinx.coroutines.CoroutineScope) = 
      (r4v9 kotlinx.coroutines.CoroutineScope)
      (r4v9 kotlinx.coroutines.CoroutineScope)
      (r4v13 kotlinx.coroutines.CoroutineScope)
     binds: [B:85:0x0214, B:87:0x0229, B:31:0x009e] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0026, all -> 0x0022, blocks: (B:6:0x0017, B:132:0x0360, B:13:0x0030, B:129:0x0343, B:16:0x003b, B:124:0x032a, B:126:0x0330, B:19:0x004e, B:117:0x02f3, B:120:0x0304, B:22:0x0059, B:112:0x02d7, B:114:0x02dd, B:25:0x0069, B:97:0x026f, B:99:0x0275, B:100:0x0280, B:28:0x0081, B:92:0x024f, B:94:0x0255, B:101:0x0281, B:103:0x028c, B:105:0x0296, B:107:0x029c, B:108:0x02b3, B:118:0x02fe, B:133:0x036a, B:134:0x0371, B:31:0x009e, B:89:0x022d, B:34:0x00af, B:84:0x0210, B:86:0x0216, B:37:0x00c0, B:76:0x01e1, B:78:0x01e7, B:79:0x01f2, B:40:0x00d6, B:71:0x01c4, B:73:0x01ca, B:80:0x01f3, B:43:0x00ec, B:62:0x0182, B:64:0x0188, B:65:0x019b, B:68:0x01a7, B:46:0x00ff, B:58:0x0162, B:49:0x010d, B:51:0x012a, B:53:0x0130), top: B:145:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0255 A[Catch: all -> 0x0022, CancellationException -> 0x0026, TryCatch #2 {CancellationException -> 0x0026, all -> 0x0022, blocks: (B:6:0x0017, B:132:0x0360, B:13:0x0030, B:129:0x0343, B:16:0x003b, B:124:0x032a, B:126:0x0330, B:19:0x004e, B:117:0x02f3, B:120:0x0304, B:22:0x0059, B:112:0x02d7, B:114:0x02dd, B:25:0x0069, B:97:0x026f, B:99:0x0275, B:100:0x0280, B:28:0x0081, B:92:0x024f, B:94:0x0255, B:101:0x0281, B:103:0x028c, B:105:0x0296, B:107:0x029c, B:108:0x02b3, B:118:0x02fe, B:133:0x036a, B:134:0x0371, B:31:0x009e, B:89:0x022d, B:34:0x00af, B:84:0x0210, B:86:0x0216, B:37:0x00c0, B:76:0x01e1, B:78:0x01e7, B:79:0x01f2, B:40:0x00d6, B:71:0x01c4, B:73:0x01ca, B:80:0x01f3, B:43:0x00ec, B:62:0x0182, B:64:0x0188, B:65:0x019b, B:68:0x01a7, B:46:0x00ff, B:58:0x0162, B:49:0x010d, B:51:0x012a, B:53:0x0130), top: B:145:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0275 A[Catch: all -> 0x0022, CancellationException -> 0x0026, TryCatch #2 {CancellationException -> 0x0026, all -> 0x0022, blocks: (B:6:0x0017, B:132:0x0360, B:13:0x0030, B:129:0x0343, B:16:0x003b, B:124:0x032a, B:126:0x0330, B:19:0x004e, B:117:0x02f3, B:120:0x0304, B:22:0x0059, B:112:0x02d7, B:114:0x02dd, B:25:0x0069, B:97:0x026f, B:99:0x0275, B:100:0x0280, B:28:0x0081, B:92:0x024f, B:94:0x0255, B:101:0x0281, B:103:0x028c, B:105:0x0296, B:107:0x029c, B:108:0x02b3, B:118:0x02fe, B:133:0x036a, B:134:0x0371, B:31:0x009e, B:89:0x022d, B:34:0x00af, B:84:0x0210, B:86:0x0216, B:37:0x00c0, B:76:0x01e1, B:78:0x01e7, B:79:0x01f2, B:40:0x00d6, B:71:0x01c4, B:73:0x01ca, B:80:0x01f3, B:43:0x00ec, B:62:0x0182, B:64:0x0188, B:65:0x019b, B:68:0x01a7, B:46:0x00ff, B:58:0x0162, B:49:0x010d, B:51:0x012a, B:53:0x0130), top: B:145:0x000c }] */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeSDK$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super z> dVar) {
        return ((InitializeSDK$doWork$2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
