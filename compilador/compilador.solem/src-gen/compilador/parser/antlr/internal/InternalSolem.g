/*
 * generated by Xtext 2.34.0
 */
grammar InternalSolem;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package compilador.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package compilador.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import compilador.services.SolemGrammarAccess;

}

@parser::members {

 	private SolemGrammarAccess grammarAccess;

    public InternalSolemParser(TokenStream input, SolemGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Programa";
   	}

   	@Override
   	protected SolemGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRulePrograma
entryRulePrograma returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProgramaRule()); }
	iv_rulePrograma=rulePrograma
	{ $current=$iv_rulePrograma.current; }
	EOF;

// Rule Programa
rulePrograma returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=':'
		{
			newLeafNode(otherlv_0, grammarAccess.getProgramaAccess().getColonKeyword_0());
		}
		otherlv_1='DECLARACOES'
		{
			newLeafNode(otherlv_1, grammarAccess.getProgramaAccess().getDECLARACOESKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramaAccess().getDeclaracoesDeclaracaoParserRuleCall_2_0());
				}
				lv_declaracoes_2_0=ruleDeclaracao
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramaRule());
					}
					add(
						$current,
						"declaracoes",
						lv_declaracoes_2_0,
						"compilador.Solem.Declaracao");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3=':'
		{
			newLeafNode(otherlv_3, grammarAccess.getProgramaAccess().getColonKeyword_3());
		}
		otherlv_4='ALGORITMO'
		{
			newLeafNode(otherlv_4, grammarAccess.getProgramaAccess().getALGORITMOKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramaAccess().getComandosComandoParserRuleCall_5_0());
				}
				lv_comandos_5_0=ruleComando
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramaRule());
					}
					add(
						$current,
						"comandos",
						lv_comandos_5_0,
						"compilador.Solem.Comando");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleDeclaracao
entryRuleDeclaracao returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDeclaracaoRule()); }
	iv_ruleDeclaracao=ruleDeclaracao
	{ $current=$iv_ruleDeclaracao.current; }
	EOF;

// Rule Declaracao
ruleDeclaracao returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getDeclaracaoAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDeclaracaoRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getDeclaracaoAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDeclaracaoAccess().getTipoTipoVarParserRuleCall_2_0());
				}
				lv_tipo_2_0=ruleTipoVar
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDeclaracaoRule());
					}
					set(
						$current,
						"tipo",
						lv_tipo_2_0,
						"compilador.Solem.TipoVar");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleExpressaoAritmetica
entryRuleExpressaoAritmetica returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressaoAritmeticaRule()); }
	iv_ruleExpressaoAritmetica=ruleExpressaoAritmetica
	{ $current=$iv_ruleExpressaoAritmetica.current; }
	EOF;

// Rule ExpressaoAritmetica
ruleExpressaoAritmetica returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getExpressaoAritmeticaAccess().getTermo1TermoAritmeticoParserRuleCall_0_0());
				}
				lv_termo1_0_0=ruleTermoAritmetico
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExpressaoAritmeticaRule());
					}
					set(
						$current,
						"termo1",
						lv_termo1_0_0,
						"compilador.Solem.TermoAritmetico");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getExpressaoAritmeticaAccess().getOutrosTermosOutroTermoAritmeticoParserRuleCall_1_0());
				}
				lv_outrosTermos_1_0=ruleOutroTermoAritmetico
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExpressaoAritmeticaRule());
					}
					add(
						$current,
						"outrosTermos",
						lv_outrosTermos_1_0,
						"compilador.Solem.OutroTermoAritmetico");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleOutroTermoAritmetico
entryRuleOutroTermoAritmetico returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOutroTermoAritmeticoRule()); }
	iv_ruleOutroTermoAritmetico=ruleOutroTermoAritmetico
	{ $current=$iv_ruleOutroTermoAritmetico.current; }
	EOF;

// Rule OutroTermoAritmetico
ruleOutroTermoAritmetico returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getOutroTermoAritmeticoAccess().getOperadorOpArit1ParserRuleCall_0_0());
				}
				lv_operador_0_0=ruleOpArit1
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOutroTermoAritmeticoRule());
					}
					set(
						$current,
						"operador",
						lv_operador_0_0,
						"compilador.Solem.OpArit1");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getOutroTermoAritmeticoAccess().getTermoTermoAritmeticoParserRuleCall_1_0());
				}
				lv_termo_1_0=ruleTermoAritmetico
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOutroTermoAritmeticoRule());
					}
					set(
						$current,
						"termo",
						lv_termo_1_0,
						"compilador.Solem.TermoAritmetico");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleTermoAritmetico
entryRuleTermoAritmetico returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTermoAritmeticoRule()); }
	iv_ruleTermoAritmetico=ruleTermoAritmetico
	{ $current=$iv_ruleTermoAritmetico.current; }
	EOF;

// Rule TermoAritmetico
ruleTermoAritmetico returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getTermoAritmeticoAccess().getFator1FatorAritmeticoParserRuleCall_0_0());
				}
				lv_fator1_0_0=ruleFatorAritmetico
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTermoAritmeticoRule());
					}
					set(
						$current,
						"fator1",
						lv_fator1_0_0,
						"compilador.Solem.FatorAritmetico");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTermoAritmeticoAccess().getOutrosFatoresOutroFatorAritmeticoParserRuleCall_1_0());
				}
				lv_outrosFatores_1_0=ruleOutroFatorAritmetico
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTermoAritmeticoRule());
					}
					add(
						$current,
						"outrosFatores",
						lv_outrosFatores_1_0,
						"compilador.Solem.OutroFatorAritmetico");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleOutroFatorAritmetico
entryRuleOutroFatorAritmetico returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOutroFatorAritmeticoRule()); }
	iv_ruleOutroFatorAritmetico=ruleOutroFatorAritmetico
	{ $current=$iv_ruleOutroFatorAritmetico.current; }
	EOF;

// Rule OutroFatorAritmetico
ruleOutroFatorAritmetico returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getOutroFatorAritmeticoAccess().getOperadorOpArit2ParserRuleCall_0_0());
				}
				lv_operador_0_0=ruleOpArit2
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOutroFatorAritmeticoRule());
					}
					set(
						$current,
						"operador",
						lv_operador_0_0,
						"compilador.Solem.OpArit2");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getOutroFatorAritmeticoAccess().getFatorFatorAritmeticoParserRuleCall_1_0());
				}
				lv_fator_1_0=ruleFatorAritmetico
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOutroFatorAritmeticoRule());
					}
					set(
						$current,
						"fator",
						lv_fator_1_0,
						"compilador.Solem.FatorAritmetico");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleFatorAritmetico
entryRuleFatorAritmetico returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFatorAritmeticoRule()); }
	iv_ruleFatorAritmetico=ruleFatorAritmetico
	{ $current=$iv_ruleFatorAritmetico.current; }
	EOF;

// Rule FatorAritmetico
ruleFatorAritmetico returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getFatorAritmeticoAccess().getFatorNumeroParserRuleCall_0());
		}
		this_FatorNumero_0=ruleFatorNumero
		{
			$current = $this_FatorNumero_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFatorAritmeticoAccess().getFatorVariavelParserRuleCall_1());
		}
		this_FatorVariavel_1=ruleFatorVariavel
		{
			$current = $this_FatorVariavel_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFatorAritmeticoAccess().getFatorSubExpressaoParserRuleCall_2());
		}
		this_FatorSubExpressao_2=ruleFatorSubExpressao
		{
			$current = $this_FatorSubExpressao_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleFatorNumero
entryRuleFatorNumero returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFatorNumeroRule()); }
	iv_ruleFatorNumero=ruleFatorNumero
	{ $current=$iv_ruleFatorNumero.current; }
	EOF;

// Rule FatorNumero
ruleFatorNumero returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_numero_0_0=RULE_INT
			{
				newLeafNode(lv_numero_0_0, grammarAccess.getFatorNumeroAccess().getNumeroINTTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getFatorNumeroRule());
				}
				setWithLastConsumed(
					$current,
					"numero",
					lv_numero_0_0,
					"org.eclipse.xtext.common.Terminals.INT");
			}
		)
	)
;

// Entry rule entryRuleFatorVariavel
entryRuleFatorVariavel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFatorVariavelRule()); }
	iv_ruleFatorVariavel=ruleFatorVariavel
	{ $current=$iv_ruleFatorVariavel.current; }
	EOF;

// Rule FatorVariavel
ruleFatorVariavel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getFatorVariavelRule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getFatorVariavelAccess().getVariavelDeclaracaoCrossReference_0());
			}
		)
	)
;

// Entry rule entryRuleFatorSubExpressao
entryRuleFatorSubExpressao returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFatorSubExpressaoRule()); }
	iv_ruleFatorSubExpressao=ruleFatorSubExpressao
	{ $current=$iv_ruleFatorSubExpressao.current; }
	EOF;

// Rule FatorSubExpressao
ruleFatorSubExpressao returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getFatorSubExpressaoAccess().getLeftParenthesisKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFatorSubExpressaoAccess().getExpressaoExpressaoAritmeticaParserRuleCall_1_0());
				}
				lv_expressao_1_0=ruleExpressaoAritmetica
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFatorSubExpressaoRule());
					}
					set(
						$current,
						"expressao",
						lv_expressao_1_0,
						"compilador.Solem.ExpressaoAritmetica");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=')'
		{
			newLeafNode(otherlv_2, grammarAccess.getFatorSubExpressaoAccess().getRightParenthesisKeyword_2());
		}
	)
;

// Entry rule entryRuleExpressaoRelacional
entryRuleExpressaoRelacional returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressaoRelacionalRule()); }
	iv_ruleExpressaoRelacional=ruleExpressaoRelacional
	{ $current=$iv_ruleExpressaoRelacional.current; }
	EOF;

// Rule ExpressaoRelacional
ruleExpressaoRelacional returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getExpressaoRelacionalAccess().getTermo1TermoRelacionalParserRuleCall_0_0());
				}
				lv_termo1_0_0=ruleTermoRelacional
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExpressaoRelacionalRule());
					}
					set(
						$current,
						"termo1",
						lv_termo1_0_0,
						"compilador.Solem.TermoRelacional");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getExpressaoRelacionalAccess().getOutrosTermosOutroTermoRelacionalParserRuleCall_1_0());
				}
				lv_outrosTermos_1_0=ruleOutroTermoRelacional
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExpressaoRelacionalRule());
					}
					add(
						$current,
						"outrosTermos",
						lv_outrosTermos_1_0,
						"compilador.Solem.OutroTermoRelacional");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleOutroTermoRelacional
entryRuleOutroTermoRelacional returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOutroTermoRelacionalRule()); }
	iv_ruleOutroTermoRelacional=ruleOutroTermoRelacional
	{ $current=$iv_ruleOutroTermoRelacional.current; }
	EOF;

// Rule OutroTermoRelacional
ruleOutroTermoRelacional returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getOutroTermoRelacionalAccess().getOperadorOpBoolParserRuleCall_0_0());
				}
				lv_operador_0_0=ruleOpBool
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOutroTermoRelacionalRule());
					}
					set(
						$current,
						"operador",
						lv_operador_0_0,
						"compilador.Solem.OpBool");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getOutroTermoRelacionalAccess().getTermoTermoRelacionalParserRuleCall_1_0());
				}
				lv_termo_1_0=ruleTermoRelacional
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOutroTermoRelacionalRule());
					}
					set(
						$current,
						"termo",
						lv_termo_1_0,
						"compilador.Solem.TermoRelacional");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleTermoRelacional
entryRuleTermoRelacional returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTermoRelacionalRule()); }
	iv_ruleTermoRelacional=ruleTermoRelacional
	{ $current=$iv_ruleTermoRelacional.current; }
	EOF;

// Rule TermoRelacional
ruleTermoRelacional returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTermoRelacionalAccess().getTermoComparacaoRelacionalParserRuleCall_0());
		}
		this_TermoComparacaoRelacional_0=ruleTermoComparacaoRelacional
		{
			$current = $this_TermoComparacaoRelacional_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTermoRelacionalAccess().getTermoSubExpressaoRelacionalParserRuleCall_1());
		}
		this_TermoSubExpressaoRelacional_1=ruleTermoSubExpressaoRelacional
		{
			$current = $this_TermoSubExpressaoRelacional_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleTermoComparacaoRelacional
entryRuleTermoComparacaoRelacional returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTermoComparacaoRelacionalRule()); }
	iv_ruleTermoComparacaoRelacional=ruleTermoComparacaoRelacional
	{ $current=$iv_ruleTermoComparacaoRelacional.current; }
	EOF;

// Rule TermoComparacaoRelacional
ruleTermoComparacaoRelacional returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getTermoComparacaoRelacionalAccess().getExp1ExpressaoAritmeticaParserRuleCall_0_0());
				}
				lv_exp1_0_0=ruleExpressaoAritmetica
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTermoComparacaoRelacionalRule());
					}
					set(
						$current,
						"exp1",
						lv_exp1_0_0,
						"compilador.Solem.ExpressaoAritmetica");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTermoComparacaoRelacionalAccess().getOpRelOpRelParserRuleCall_1_0());
				}
				lv_opRel_1_0=ruleOpRel
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTermoComparacaoRelacionalRule());
					}
					set(
						$current,
						"opRel",
						lv_opRel_1_0,
						"compilador.Solem.OpRel");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTermoComparacaoRelacionalAccess().getExp2ExpressaoAritmeticaParserRuleCall_2_0());
				}
				lv_exp2_2_0=ruleExpressaoAritmetica
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTermoComparacaoRelacionalRule());
					}
					set(
						$current,
						"exp2",
						lv_exp2_2_0,
						"compilador.Solem.ExpressaoAritmetica");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleTermoSubExpressaoRelacional
entryRuleTermoSubExpressaoRelacional returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTermoSubExpressaoRelacionalRule()); }
	iv_ruleTermoSubExpressaoRelacional=ruleTermoSubExpressaoRelacional
	{ $current=$iv_ruleTermoSubExpressaoRelacional.current; }
	EOF;

// Rule TermoSubExpressaoRelacional
ruleTermoSubExpressaoRelacional returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='['
		{
			newLeafNode(otherlv_0, grammarAccess.getTermoSubExpressaoRelacionalAccess().getLeftSquareBracketKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTermoSubExpressaoRelacionalAccess().getExpRelExpressaoRelacionalParserRuleCall_1_0());
				}
				lv_expRel_1_0=ruleExpressaoRelacional
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTermoSubExpressaoRelacionalRule());
					}
					set(
						$current,
						"expRel",
						lv_expRel_1_0,
						"compilador.Solem.ExpressaoRelacional");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=']'
		{
			newLeafNode(otherlv_2, grammarAccess.getTermoSubExpressaoRelacionalAccess().getRightSquareBracketKeyword_2());
		}
	)
;

// Entry rule entryRuleComando
entryRuleComando returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComandoRule()); }
	iv_ruleComando=ruleComando
	{ $current=$iv_ruleComando.current; }
	EOF;

// Rule Comando
ruleComando returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getComandoAccess().getComandoAtribuicaoParserRuleCall_0());
		}
		this_ComandoAtribuicao_0=ruleComandoAtribuicao
		{
			$current = $this_ComandoAtribuicao_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getComandoAccess().getComandoEntradaParserRuleCall_1());
		}
		this_ComandoEntrada_1=ruleComandoEntrada
		{
			$current = $this_ComandoEntrada_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getComandoAccess().getComandoSaidaParserRuleCall_2());
		}
		this_ComandoSaida_2=ruleComandoSaida
		{
			$current = $this_ComandoSaida_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getComandoAccess().getComandoCondicaoParserRuleCall_3());
		}
		this_ComandoCondicao_3=ruleComandoCondicao
		{
			$current = $this_ComandoCondicao_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getComandoAccess().getComandoRepeticaoParserRuleCall_4());
		}
		this_ComandoRepeticao_4=ruleComandoRepeticao
		{
			$current = $this_ComandoRepeticao_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getComandoAccess().getSubAlgoritmoParserRuleCall_5());
		}
		this_SubAlgoritmo_5=ruleSubAlgoritmo
		{
			$current = $this_SubAlgoritmo_5.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleComandoAtribuicao
entryRuleComandoAtribuicao returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComandoAtribuicaoRule()); }
	iv_ruleComandoAtribuicao=ruleComandoAtribuicao
	{ $current=$iv_ruleComandoAtribuicao.current; }
	EOF;

// Rule ComandoAtribuicao
ruleComandoAtribuicao returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ATRIBUIR'
		{
			newLeafNode(otherlv_0, grammarAccess.getComandoAtribuicaoAccess().getATRIBUIRKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getComandoAtribuicaoAccess().getExpExpressaoAritmeticaParserRuleCall_1_0());
				}
				lv_exp_1_0=ruleExpressaoAritmetica
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComandoAtribuicaoRule());
					}
					set(
						$current,
						"exp",
						lv_exp_1_0,
						"compilador.Solem.ExpressaoAritmetica");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='A'
		{
			newLeafNode(otherlv_2, grammarAccess.getComandoAtribuicaoAccess().getAKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComandoAtribuicaoRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getComandoAtribuicaoAccess().getVariavelDeclaracaoCrossReference_3_0());
				}
			)
		)
	)
;

// Entry rule entryRuleComandoEntrada
entryRuleComandoEntrada returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComandoEntradaRule()); }
	iv_ruleComandoEntrada=ruleComandoEntrada
	{ $current=$iv_ruleComandoEntrada.current; }
	EOF;

// Rule ComandoEntrada
ruleComandoEntrada returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='LER'
		{
			newLeafNode(otherlv_0, grammarAccess.getComandoEntradaAccess().getLERKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComandoEntradaRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getComandoEntradaAccess().getVariavelDeclaracaoCrossReference_1_0());
				}
			)
		)
	)
;

// Entry rule entryRuleComandoSaida
entryRuleComandoSaida returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComandoSaidaRule()); }
	iv_ruleComandoSaida=ruleComandoSaida
	{ $current=$iv_ruleComandoSaida.current; }
	EOF;

// Rule ComandoSaida
ruleComandoSaida returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='IMPRIMIR'
		{
			newLeafNode(otherlv_0, grammarAccess.getComandoSaidaAccess().getIMPRIMIRKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComandoSaidaRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getComandoSaidaAccess().getVariavelDeclaracaoCrossReference_1_0());
				}
			)
		)
	)
;

// Entry rule entryRuleComandoCondicao
entryRuleComandoCondicao returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComandoCondicaoRule()); }
	iv_ruleComandoCondicao=ruleComandoCondicao
	{ $current=$iv_ruleComandoCondicao.current; }
	EOF;

// Rule ComandoCondicao
ruleComandoCondicao returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='SE'
		{
			newLeafNode(otherlv_0, grammarAccess.getComandoCondicaoAccess().getSEKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getComandoCondicaoAccess().getExpExpressaoRelacionalParserRuleCall_1_0());
				}
				lv_exp_1_0=ruleExpressaoRelacional
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComandoCondicaoRule());
					}
					set(
						$current,
						"exp",
						lv_exp_1_0,
						"compilador.Solem.ExpressaoRelacional");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='ENTAO'
		{
			newLeafNode(otherlv_2, grammarAccess.getComandoCondicaoAccess().getENTAOKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getComandoCondicaoAccess().getCmd1ComandoParserRuleCall_3_0());
				}
				lv_cmd1_3_0=ruleComando
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComandoCondicaoRule());
					}
					set(
						$current,
						"cmd1",
						lv_cmd1_3_0,
						"compilador.Solem.Comando");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4='SENAO'
			{
				newLeafNode(otherlv_4, grammarAccess.getComandoCondicaoAccess().getSENAOKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getComandoCondicaoAccess().getCmd2ComandoParserRuleCall_4_1_0());
					}
					lv_cmd2_5_0=ruleComando
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getComandoCondicaoRule());
						}
						set(
							$current,
							"cmd2",
							lv_cmd2_5_0,
							"compilador.Solem.Comando");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleComandoRepeticao
entryRuleComandoRepeticao returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComandoRepeticaoRule()); }
	iv_ruleComandoRepeticao=ruleComandoRepeticao
	{ $current=$iv_ruleComandoRepeticao.current; }
	EOF;

// Rule ComandoRepeticao
ruleComandoRepeticao returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ENQUANTO'
		{
			newLeafNode(otherlv_0, grammarAccess.getComandoRepeticaoAccess().getENQUANTOKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getComandoRepeticaoAccess().getExpExpressaoRelacionalParserRuleCall_1_0());
				}
				lv_exp_1_0=ruleExpressaoRelacional
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComandoRepeticaoRule());
					}
					set(
						$current,
						"exp",
						lv_exp_1_0,
						"compilador.Solem.ExpressaoRelacional");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getComandoRepeticaoAccess().getCmdComandoParserRuleCall_2_0());
				}
				lv_cmd_2_0=ruleComando
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComandoRepeticaoRule());
					}
					set(
						$current,
						"cmd",
						lv_cmd_2_0,
						"compilador.Solem.Comando");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSubAlgoritmo
entryRuleSubAlgoritmo returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSubAlgoritmoRule()); }
	iv_ruleSubAlgoritmo=ruleSubAlgoritmo
	{ $current=$iv_ruleSubAlgoritmo.current; }
	EOF;

// Rule SubAlgoritmo
ruleSubAlgoritmo returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='INICIO'
		{
			newLeafNode(otherlv_0, grammarAccess.getSubAlgoritmoAccess().getINICIOKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSubAlgoritmoAccess().getComandosComandoParserRuleCall_1_0());
				}
				lv_comandos_1_0=ruleComando
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSubAlgoritmoRule());
					}
					add(
						$current,
						"comandos",
						lv_comandos_1_0,
						"compilador.Solem.Comando");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_2='FIM'
		{
			newLeafNode(otherlv_2, grammarAccess.getSubAlgoritmoAccess().getFIMKeyword_2());
		}
	)
;

// Entry rule entryRuleTipoVar
entryRuleTipoVar returns [String current=null]:
	{ newCompositeNode(grammarAccess.getTipoVarRule()); }
	iv_ruleTipoVar=ruleTipoVar
	{ $current=$iv_ruleTipoVar.current.getText(); }
	EOF;

// Rule TipoVar
ruleTipoVar returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='INTEIRO'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTipoVarAccess().getINTEIROKeyword_0());
		}
		    |
		kw='REAL'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTipoVarAccess().getREALKeyword_1());
		}
	)
;

// Entry rule entryRuleOpArit1
entryRuleOpArit1 returns [String current=null]:
	{ newCompositeNode(grammarAccess.getOpArit1Rule()); }
	iv_ruleOpArit1=ruleOpArit1
	{ $current=$iv_ruleOpArit1.current.getText(); }
	EOF;

// Rule OpArit1
ruleOpArit1 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='+'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOpArit1Access().getPlusSignKeyword_0());
		}
		    |
		kw='-'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOpArit1Access().getHyphenMinusKeyword_1());
		}
	)
;

// Entry rule entryRuleOpArit2
entryRuleOpArit2 returns [String current=null]:
	{ newCompositeNode(grammarAccess.getOpArit2Rule()); }
	iv_ruleOpArit2=ruleOpArit2
	{ $current=$iv_ruleOpArit2.current.getText(); }
	EOF;

// Rule OpArit2
ruleOpArit2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='*'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOpArit2Access().getAsteriskKeyword_0());
		}
		    |
		kw='/'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOpArit2Access().getSolidusKeyword_1());
		}
	)
;

// Entry rule entryRuleOpRel
entryRuleOpRel returns [String current=null]:
	{ newCompositeNode(grammarAccess.getOpRelRule()); }
	iv_ruleOpRel=ruleOpRel
	{ $current=$iv_ruleOpRel.current.getText(); }
	EOF;

// Rule OpRel
ruleOpRel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='>'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOpRelAccess().getGreaterThanSignKeyword_0());
		}
		    |
		kw='>='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOpRelAccess().getGreaterThanSignEqualsSignKeyword_1());
		}
		    |
		kw='<'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOpRelAccess().getLessThanSignKeyword_2());
		}
		    |
		kw='<='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOpRelAccess().getLessThanSignEqualsSignKeyword_3());
		}
		    |
		kw='<>'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOpRelAccess().getLessThanSignGreaterThanSignKeyword_4());
		}
		    |
		kw='='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOpRelAccess().getEqualsSignKeyword_5());
		}
	)
;

// Entry rule entryRuleOpBool
entryRuleOpBool returns [String current=null]:
	{ newCompositeNode(grammarAccess.getOpBoolRule()); }
	iv_ruleOpBool=ruleOpBool
	{ $current=$iv_ruleOpBool.current.getText(); }
	EOF;

// Rule OpBool
ruleOpBool returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='E'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOpBoolAccess().getEKeyword_0());
		}
		    |
		kw='OU'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOpBoolAccess().getOUKeyword_1());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
