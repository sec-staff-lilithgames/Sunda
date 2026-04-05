package pw;

import java.io.Closeable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract /* synthetic */ class j0 {
    public static final z0 blackhole() {
        return new f();
    }

    public static final k buffer(b1 b1Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(b1Var, "<this>");
        return new v0(b1Var);
    }

    public static final <T extends Closeable, R> R use(T t10, kv.l block) throws Throwable {
        Object obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        Throwable th2 = (R) null;
        try {
            Object objInvoke = block.invoke(t10);
            kotlin.jvm.internal.b0.finallyStart(1);
            Throwable th3 = th2;
            if (t10 != null) {
                try {
                    t10.close();
                    th3 = th2;
                } catch (Throwable 
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
                    	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:369)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:332)
                    	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:317)
                    	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:79)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:403)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:391)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:341)
                    */
                /*
                    java.lang.String r0 = "block"
                    kotlin.jvm.internal.e0.checkNotNullParameter(r4, r0)
                    r0 = 1
                    r1 = 0
                    java.lang.Object r4 = r4.invoke(r3)     // Catch: java.lang.Throwable -> L1c
                    kotlin.jvm.internal.b0.finallyStart(r0)
                    if (r3 == 0) goto L15
                    r3.close()     // Catch: java.lang.Throwable -> L14
                    goto L15
                L14:
                    r1 = move-exception
                L15:
                    kotlin.jvm.internal.b0.finallyEnd(r0)
                    r2 = r1
                    r1 = r4
                    r4 = r2
                    goto L2d
                L1c:
                    r4 = move-exception
                    kotlin.jvm.internal.b0.finallyStart(r0)
                    if (r3 == 0) goto L2a
                    r3.close()     // Catch: java.lang.Throwable -> L26
                    goto L2a
                L26:
                    r3 = move-exception
                    tu.h.addSuppressed(r4, r3)
                L2a:
                    kotlin.jvm.internal.b0.finallyEnd(r0)
                L2d:
                    if (r4 != 0) goto L30
                    return r1
                L30:
                    throw r4
                */
                throw new UnsupportedOperationException("Method not decompiled: pw.j0.use(java.io.Closeable, kv.l):java.lang.Object");
            }

            public static final j buffer(z0 z0Var) {
                kotlin.jvm.internal.e0.checkNotNullParameter(z0Var, "<this>");
                return new t0(z0Var);
            }
        }
