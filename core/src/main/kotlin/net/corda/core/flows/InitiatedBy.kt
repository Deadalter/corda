package net.corda.core.flows

import kotlin.annotation.AnnotationTarget.CLASS
import kotlin.reflect.KClass

/**
 * This annotation is required by any [FlowLogic] that is designed to be initiated by a counterparty flow. The flow that
 * does the initiating is specified by the [value] property and itself must be annotated with [InitiatingFlow].
 *
 * The node on startup scans for [FlowLogic]s which are annotated with this and automatically registers the initiating
 * to initiated flow mapping.
 *
 * @see InitiatingFlow
 */
@Target(CLASS)
annotation class InitiatedBy(val value: KClass<out FlowLogic<*>>)