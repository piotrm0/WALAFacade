package edu.illinois.wala
import com.ibm.wala.ipa.cfg.BasicBlockInContext
import com.ibm.wala.ipa.callgraph.CGNode
import com.ibm.wala.ipa.callgraph.propagation.LocalPointerKey
import com.ibm.wala.ipa.callgraph.propagation.InstanceKey
import com.ibm.wala.ssa.SSAInstruction
import com.ibm.wala.ipa.callgraph.CallGraph
import com.ibm.wala.classLoader.IClass
import com.ibm.wala.classLoader.IMethod
import com.ibm.wala.ssa.analysis.IExplodedBasicBlock
import com.ibm.wala.classLoader.IField
import com.ibm.wala.ipa.callgraph.propagation.PointerKey

import com.ibm.wala.ssa._

trait TypeAliases {
  type N = CGNode

  type BB = ISSABasicBlock
  type SS = BasicBlockInContext[IExplodedBasicBlock]

  type P = PointerKey
  type LocalP = LocalPointerKey

  type O = InstanceKey

  type F = IField

  type WithReference = { def ref: Int }

  type I = SSAInstruction
  type ReferenceI = I with WithReference
  type AccessI = SSAFieldAccessInstruction
  type PutI = SSAPutInstruction
  type GetI = SSAGetInstruction

  type PhiI = SSAPhiInstruction

  type ArrayStoreI = SSAArrayStoreInstruction
  type ArrayLoadI = SSAArrayLoadInstruction
  type ArrayReferenceI = SSAArrayReferenceInstruction

  type InvokeI = SSAInvokeInstruction

  type MonitorI = SSAMonitorInstruction

  type G = CallGraph
  type C = IClass
  type M = IMethod
  
  type ProgramCounter = com.ibm.wala.classLoader.ProgramCounter
}
