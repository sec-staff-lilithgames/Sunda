package com.applovin.shadow.okio.internal;

import av.e;
import bv.f;
import bv.l;
import com.applovin.shadow.okio.FileSystem;
import com.applovin.shadow.okio.Path;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kv.p;
import rv.v;
import tu.a0;
import tu.x0;
import uu.u;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.applovin.shadow.okio.internal.-FileSystem$commonDeleteRecursively$sequence$1", f = "FileSystem.kt", i = {}, l = {TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.applovin.shadow.okio.internal.-FileSystem$commonDeleteRecursively$sequence$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class FileSystem$commonDeleteRecursively$sequence$1 extends l implements p {
    final /* synthetic */ Path $fileOrDirectory;
    final /* synthetic */ FileSystem $this_commonDeleteRecursively;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystem$commonDeleteRecursively$sequence$1(FileSystem fileSystem, Path path, d<? super FileSystem$commonDeleteRecursively$sequence$1> dVar) {
        super(2, dVar);
        this.$this_commonDeleteRecursively = fileSystem;
        this.$fileOrDirectory = path;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        FileSystem$commonDeleteRecursively$sequence$1 fileSystem$commonDeleteRecursively$sequence$1 = new FileSystem$commonDeleteRecursively$sequence$1(this.$this_commonDeleteRecursively, this.$fileOrDirectory, dVar);
        fileSystem$commonDeleteRecursively$sequence$1.L$0 = obj;
        return fileSystem$commonDeleteRecursively$sequence$1;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            v vVar = (v) this.L$0;
            FileSystem fileSystem = this.$this_commonDeleteRecursively;
            u uVar = new u();
            Path path = this.$fileOrDirectory;
            this.label = 1;
            if (FileSystem.collectRecursively(vVar, fileSystem, uVar, path, false, true, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
        }
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(v vVar, d<? super x0> dVar) {
        return ((FileSystem$commonDeleteRecursively$sequence$1) create(vVar, dVar)).invokeSuspend(x0.f87415a);
    }
}
