package de.tgremple.siteanalyser.configuration.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.tgremple.siteanalyser.configuration.services.ConfigurationLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalConfigurationLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'content'", "'type'", "'is'", "'recognized'", "'by'", "'recognize'", "'page'", "'css'", "'url'", "'pattern'", "'as'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalConfigurationLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalConfigurationLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalConfigurationLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalConfigurationLanguage.g"; }



     	private ConfigurationLanguageGrammarAccess grammarAccess;

        public InternalConfigurationLanguageParser(TokenStream input, ConfigurationLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SiteStructure";
       	}

       	@Override
       	protected ConfigurationLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSiteStructure"
    // InternalConfigurationLanguage.g:64:1: entryRuleSiteStructure returns [EObject current=null] : iv_ruleSiteStructure= ruleSiteStructure EOF ;
    public final EObject entryRuleSiteStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSiteStructure = null;


        try {
            // InternalConfigurationLanguage.g:64:54: (iv_ruleSiteStructure= ruleSiteStructure EOF )
            // InternalConfigurationLanguage.g:65:2: iv_ruleSiteStructure= ruleSiteStructure EOF
            {
             newCompositeNode(grammarAccess.getSiteStructureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSiteStructure=ruleSiteStructure();

            state._fsp--;

             current =iv_ruleSiteStructure; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSiteStructure"


    // $ANTLR start "ruleSiteStructure"
    // InternalConfigurationLanguage.g:71:1: ruleSiteStructure returns [EObject current=null] : ( (lv_typeDefinitions_0_0= ruleType ) )* ;
    public final EObject ruleSiteStructure() throws RecognitionException {
        EObject current = null;

        EObject lv_typeDefinitions_0_0 = null;



        	enterRule();

        try {
            // InternalConfigurationLanguage.g:77:2: ( ( (lv_typeDefinitions_0_0= ruleType ) )* )
            // InternalConfigurationLanguage.g:78:2: ( (lv_typeDefinitions_0_0= ruleType ) )*
            {
            // InternalConfigurationLanguage.g:78:2: ( (lv_typeDefinitions_0_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalConfigurationLanguage.g:79:3: (lv_typeDefinitions_0_0= ruleType )
            	    {
            	    // InternalConfigurationLanguage.g:79:3: (lv_typeDefinitions_0_0= ruleType )
            	    // InternalConfigurationLanguage.g:80:4: lv_typeDefinitions_0_0= ruleType
            	    {

            	    				newCompositeNode(grammarAccess.getSiteStructureAccess().getTypeDefinitionsTypeParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_typeDefinitions_0_0=ruleType();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getSiteStructureRule());
            	    				}
            	    				add(
            	    					current,
            	    					"typeDefinitions",
            	    					lv_typeDefinitions_0_0,
            	    					"de.tgremple.siteanalyser.configuration.ConfigurationLanguage.Type");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSiteStructure"


    // $ANTLR start "entryRuleType"
    // InternalConfigurationLanguage.g:100:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalConfigurationLanguage.g:100:45: (iv_ruleType= ruleType EOF )
            // InternalConfigurationLanguage.g:101:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalConfigurationLanguage.g:107:1: ruleType returns [EObject current=null] : (this_ContentType_0= ruleContentType | this_PageType_1= rulePageType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_ContentType_0 = null;

        EObject this_PageType_1 = null;



        	enterRule();

        try {
            // InternalConfigurationLanguage.g:113:2: ( (this_ContentType_0= ruleContentType | this_PageType_1= rulePageType ) )
            // InternalConfigurationLanguage.g:114:2: (this_ContentType_0= ruleContentType | this_PageType_1= rulePageType )
            {
            // InternalConfigurationLanguage.g:114:2: (this_ContentType_0= ruleContentType | this_PageType_1= rulePageType )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalConfigurationLanguage.g:115:3: this_ContentType_0= ruleContentType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getContentTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ContentType_0=ruleContentType();

                    state._fsp--;


                    			current = this_ContentType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalConfigurationLanguage.g:124:3: this_PageType_1= rulePageType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getPageTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PageType_1=rulePageType();

                    state._fsp--;


                    			current = this_PageType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleContentType"
    // InternalConfigurationLanguage.g:136:1: entryRuleContentType returns [EObject current=null] : iv_ruleContentType= ruleContentType EOF ;
    public final EObject entryRuleContentType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentType = null;


        try {
            // InternalConfigurationLanguage.g:136:52: (iv_ruleContentType= ruleContentType EOF )
            // InternalConfigurationLanguage.g:137:2: iv_ruleContentType= ruleContentType EOF
            {
             newCompositeNode(grammarAccess.getContentTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContentType=ruleContentType();

            state._fsp--;

             current =iv_ruleContentType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContentType"


    // $ANTLR start "ruleContentType"
    // InternalConfigurationLanguage.g:143:1: ruleContentType returns [EObject current=null] : (otherlv_0= 'content' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' otherlv_4= 'recognized' otherlv_5= 'by' ( (lv_selector_6_0= ruleContentSelector ) ) (otherlv_7= 'recognize' ( (lv_properties_8_0= ruleProperty ) )* )? ) ;
    public final EObject ruleContentType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_selector_6_0 = null;

        EObject lv_properties_8_0 = null;



        	enterRule();

        try {
            // InternalConfigurationLanguage.g:149:2: ( (otherlv_0= 'content' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' otherlv_4= 'recognized' otherlv_5= 'by' ( (lv_selector_6_0= ruleContentSelector ) ) (otherlv_7= 'recognize' ( (lv_properties_8_0= ruleProperty ) )* )? ) )
            // InternalConfigurationLanguage.g:150:2: (otherlv_0= 'content' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' otherlv_4= 'recognized' otherlv_5= 'by' ( (lv_selector_6_0= ruleContentSelector ) ) (otherlv_7= 'recognize' ( (lv_properties_8_0= ruleProperty ) )* )? )
            {
            // InternalConfigurationLanguage.g:150:2: (otherlv_0= 'content' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' otherlv_4= 'recognized' otherlv_5= 'by' ( (lv_selector_6_0= ruleContentSelector ) ) (otherlv_7= 'recognize' ( (lv_properties_8_0= ruleProperty ) )* )? )
            // InternalConfigurationLanguage.g:151:3: otherlv_0= 'content' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' otherlv_4= 'recognized' otherlv_5= 'by' ( (lv_selector_6_0= ruleContentSelector ) ) (otherlv_7= 'recognize' ( (lv_properties_8_0= ruleProperty ) )* )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getContentTypeAccess().getContentKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getContentTypeAccess().getTypeKeyword_1());
            		
            // InternalConfigurationLanguage.g:159:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalConfigurationLanguage.g:160:4: (lv_name_2_0= RULE_ID )
            {
            // InternalConfigurationLanguage.g:160:4: (lv_name_2_0= RULE_ID )
            // InternalConfigurationLanguage.g:161:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getContentTypeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContentTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getContentTypeAccess().getIsKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getContentTypeAccess().getRecognizedKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getContentTypeAccess().getByKeyword_5());
            		
            // InternalConfigurationLanguage.g:189:3: ( (lv_selector_6_0= ruleContentSelector ) )
            // InternalConfigurationLanguage.g:190:4: (lv_selector_6_0= ruleContentSelector )
            {
            // InternalConfigurationLanguage.g:190:4: (lv_selector_6_0= ruleContentSelector )
            // InternalConfigurationLanguage.g:191:5: lv_selector_6_0= ruleContentSelector
            {

            					newCompositeNode(grammarAccess.getContentTypeAccess().getSelectorContentSelectorParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_selector_6_0=ruleContentSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContentTypeRule());
            					}
            					set(
            						current,
            						"selector",
            						lv_selector_6_0,
            						"de.tgremple.siteanalyser.configuration.ConfigurationLanguage.ContentSelector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalConfigurationLanguage.g:208:3: (otherlv_7= 'recognize' ( (lv_properties_8_0= ruleProperty ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalConfigurationLanguage.g:209:4: otherlv_7= 'recognize' ( (lv_properties_8_0= ruleProperty ) )*
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getContentTypeAccess().getRecognizeKeyword_7_0());
                    			
                    // InternalConfigurationLanguage.g:213:4: ( (lv_properties_8_0= ruleProperty ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalConfigurationLanguage.g:214:5: (lv_properties_8_0= ruleProperty )
                    	    {
                    	    // InternalConfigurationLanguage.g:214:5: (lv_properties_8_0= ruleProperty )
                    	    // InternalConfigurationLanguage.g:215:6: lv_properties_8_0= ruleProperty
                    	    {

                    	    						newCompositeNode(grammarAccess.getContentTypeAccess().getPropertiesPropertyParserRuleCall_7_1_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_properties_8_0=ruleProperty();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getContentTypeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"properties",
                    	    							lv_properties_8_0,
                    	    							"de.tgremple.siteanalyser.configuration.ConfigurationLanguage.Property");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContentType"


    // $ANTLR start "entryRulePageType"
    // InternalConfigurationLanguage.g:237:1: entryRulePageType returns [EObject current=null] : iv_rulePageType= rulePageType EOF ;
    public final EObject entryRulePageType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageType = null;


        try {
            // InternalConfigurationLanguage.g:237:49: (iv_rulePageType= rulePageType EOF )
            // InternalConfigurationLanguage.g:238:2: iv_rulePageType= rulePageType EOF
            {
             newCompositeNode(grammarAccess.getPageTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePageType=rulePageType();

            state._fsp--;

             current =iv_rulePageType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePageType"


    // $ANTLR start "rulePageType"
    // InternalConfigurationLanguage.g:244:1: rulePageType returns [EObject current=null] : (otherlv_0= 'page' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' otherlv_4= 'recognized' otherlv_5= 'by' ( (lv_selector_6_0= rulePageSelector ) ) (otherlv_7= 'recognize' ( (lv_properties_8_0= ruleProperty ) )* )? ) ;
    public final EObject rulePageType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_selector_6_0 = null;

        EObject lv_properties_8_0 = null;



        	enterRule();

        try {
            // InternalConfigurationLanguage.g:250:2: ( (otherlv_0= 'page' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' otherlv_4= 'recognized' otherlv_5= 'by' ( (lv_selector_6_0= rulePageSelector ) ) (otherlv_7= 'recognize' ( (lv_properties_8_0= ruleProperty ) )* )? ) )
            // InternalConfigurationLanguage.g:251:2: (otherlv_0= 'page' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' otherlv_4= 'recognized' otherlv_5= 'by' ( (lv_selector_6_0= rulePageSelector ) ) (otherlv_7= 'recognize' ( (lv_properties_8_0= ruleProperty ) )* )? )
            {
            // InternalConfigurationLanguage.g:251:2: (otherlv_0= 'page' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' otherlv_4= 'recognized' otherlv_5= 'by' ( (lv_selector_6_0= rulePageSelector ) ) (otherlv_7= 'recognize' ( (lv_properties_8_0= ruleProperty ) )* )? )
            // InternalConfigurationLanguage.g:252:3: otherlv_0= 'page' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' otherlv_4= 'recognized' otherlv_5= 'by' ( (lv_selector_6_0= rulePageSelector ) ) (otherlv_7= 'recognize' ( (lv_properties_8_0= ruleProperty ) )* )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPageTypeAccess().getPageKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPageTypeAccess().getTypeKeyword_1());
            		
            // InternalConfigurationLanguage.g:260:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalConfigurationLanguage.g:261:4: (lv_name_2_0= RULE_ID )
            {
            // InternalConfigurationLanguage.g:261:4: (lv_name_2_0= RULE_ID )
            // InternalConfigurationLanguage.g:262:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPageTypeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPageTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getPageTypeAccess().getIsKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getPageTypeAccess().getRecognizedKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getPageTypeAccess().getByKeyword_5());
            		
            // InternalConfigurationLanguage.g:290:3: ( (lv_selector_6_0= rulePageSelector ) )
            // InternalConfigurationLanguage.g:291:4: (lv_selector_6_0= rulePageSelector )
            {
            // InternalConfigurationLanguage.g:291:4: (lv_selector_6_0= rulePageSelector )
            // InternalConfigurationLanguage.g:292:5: lv_selector_6_0= rulePageSelector
            {

            					newCompositeNode(grammarAccess.getPageTypeAccess().getSelectorPageSelectorParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_selector_6_0=rulePageSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPageTypeRule());
            					}
            					set(
            						current,
            						"selector",
            						lv_selector_6_0,
            						"de.tgremple.siteanalyser.configuration.ConfigurationLanguage.PageSelector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalConfigurationLanguage.g:309:3: (otherlv_7= 'recognize' ( (lv_properties_8_0= ruleProperty ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalConfigurationLanguage.g:310:4: otherlv_7= 'recognize' ( (lv_properties_8_0= ruleProperty ) )*
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getPageTypeAccess().getRecognizeKeyword_7_0());
                    			
                    // InternalConfigurationLanguage.g:314:4: ( (lv_properties_8_0= ruleProperty ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalConfigurationLanguage.g:315:5: (lv_properties_8_0= ruleProperty )
                    	    {
                    	    // InternalConfigurationLanguage.g:315:5: (lv_properties_8_0= ruleProperty )
                    	    // InternalConfigurationLanguage.g:316:6: lv_properties_8_0= ruleProperty
                    	    {

                    	    						newCompositeNode(grammarAccess.getPageTypeAccess().getPropertiesPropertyParserRuleCall_7_1_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_properties_8_0=ruleProperty();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPageTypeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"properties",
                    	    							lv_properties_8_0,
                    	    							"de.tgremple.siteanalyser.configuration.ConfigurationLanguage.Property");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePageType"


    // $ANTLR start "entryRuleContentSelector"
    // InternalConfigurationLanguage.g:338:1: entryRuleContentSelector returns [EObject current=null] : iv_ruleContentSelector= ruleContentSelector EOF ;
    public final EObject entryRuleContentSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentSelector = null;


        try {
            // InternalConfigurationLanguage.g:338:56: (iv_ruleContentSelector= ruleContentSelector EOF )
            // InternalConfigurationLanguage.g:339:2: iv_ruleContentSelector= ruleContentSelector EOF
            {
             newCompositeNode(grammarAccess.getContentSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContentSelector=ruleContentSelector();

            state._fsp--;

             current =iv_ruleContentSelector; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContentSelector"


    // $ANTLR start "ruleContentSelector"
    // InternalConfigurationLanguage.g:345:1: ruleContentSelector returns [EObject current=null] : this_CssSelector_0= ruleCssSelector ;
    public final EObject ruleContentSelector() throws RecognitionException {
        EObject current = null;

        EObject this_CssSelector_0 = null;



        	enterRule();

        try {
            // InternalConfigurationLanguage.g:351:2: (this_CssSelector_0= ruleCssSelector )
            // InternalConfigurationLanguage.g:352:2: this_CssSelector_0= ruleCssSelector
            {

            		newCompositeNode(grammarAccess.getContentSelectorAccess().getCssSelectorParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_CssSelector_0=ruleCssSelector();

            state._fsp--;


            		current = this_CssSelector_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContentSelector"


    // $ANTLR start "entryRulePageSelector"
    // InternalConfigurationLanguage.g:363:1: entryRulePageSelector returns [EObject current=null] : iv_rulePageSelector= rulePageSelector EOF ;
    public final EObject entryRulePageSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageSelector = null;


        try {
            // InternalConfigurationLanguage.g:363:53: (iv_rulePageSelector= rulePageSelector EOF )
            // InternalConfigurationLanguage.g:364:2: iv_rulePageSelector= rulePageSelector EOF
            {
             newCompositeNode(grammarAccess.getPageSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePageSelector=rulePageSelector();

            state._fsp--;

             current =iv_rulePageSelector; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePageSelector"


    // $ANTLR start "rulePageSelector"
    // InternalConfigurationLanguage.g:370:1: rulePageSelector returns [EObject current=null] : (this_CssSelector_0= ruleCssSelector | this_UrlPatternSelector_1= ruleUrlPatternSelector ) ;
    public final EObject rulePageSelector() throws RecognitionException {
        EObject current = null;

        EObject this_CssSelector_0 = null;

        EObject this_UrlPatternSelector_1 = null;



        	enterRule();

        try {
            // InternalConfigurationLanguage.g:376:2: ( (this_CssSelector_0= ruleCssSelector | this_UrlPatternSelector_1= ruleUrlPatternSelector ) )
            // InternalConfigurationLanguage.g:377:2: (this_CssSelector_0= ruleCssSelector | this_UrlPatternSelector_1= ruleUrlPatternSelector )
            {
            // InternalConfigurationLanguage.g:377:2: (this_CssSelector_0= ruleCssSelector | this_UrlPatternSelector_1= ruleUrlPatternSelector )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            else if ( (LA7_0==19) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalConfigurationLanguage.g:378:3: this_CssSelector_0= ruleCssSelector
                    {

                    			newCompositeNode(grammarAccess.getPageSelectorAccess().getCssSelectorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CssSelector_0=ruleCssSelector();

                    state._fsp--;


                    			current = this_CssSelector_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalConfigurationLanguage.g:387:3: this_UrlPatternSelector_1= ruleUrlPatternSelector
                    {

                    			newCompositeNode(grammarAccess.getPageSelectorAccess().getUrlPatternSelectorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_UrlPatternSelector_1=ruleUrlPatternSelector();

                    state._fsp--;


                    			current = this_UrlPatternSelector_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePageSelector"


    // $ANTLR start "entryRuleCssSelector"
    // InternalConfigurationLanguage.g:399:1: entryRuleCssSelector returns [EObject current=null] : iv_ruleCssSelector= ruleCssSelector EOF ;
    public final EObject entryRuleCssSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCssSelector = null;


        try {
            // InternalConfigurationLanguage.g:399:52: (iv_ruleCssSelector= ruleCssSelector EOF )
            // InternalConfigurationLanguage.g:400:2: iv_ruleCssSelector= ruleCssSelector EOF
            {
             newCompositeNode(grammarAccess.getCssSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCssSelector=ruleCssSelector();

            state._fsp--;

             current =iv_ruleCssSelector; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCssSelector"


    // $ANTLR start "ruleCssSelector"
    // InternalConfigurationLanguage.g:406:1: ruleCssSelector returns [EObject current=null] : (otherlv_0= 'css' ( (lv_definition_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleCssSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_definition_1_0=null;


        	enterRule();

        try {
            // InternalConfigurationLanguage.g:412:2: ( (otherlv_0= 'css' ( (lv_definition_1_0= RULE_STRING ) ) ) )
            // InternalConfigurationLanguage.g:413:2: (otherlv_0= 'css' ( (lv_definition_1_0= RULE_STRING ) ) )
            {
            // InternalConfigurationLanguage.g:413:2: (otherlv_0= 'css' ( (lv_definition_1_0= RULE_STRING ) ) )
            // InternalConfigurationLanguage.g:414:3: otherlv_0= 'css' ( (lv_definition_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getCssSelectorAccess().getCssKeyword_0());
            		
            // InternalConfigurationLanguage.g:418:3: ( (lv_definition_1_0= RULE_STRING ) )
            // InternalConfigurationLanguage.g:419:4: (lv_definition_1_0= RULE_STRING )
            {
            // InternalConfigurationLanguage.g:419:4: (lv_definition_1_0= RULE_STRING )
            // InternalConfigurationLanguage.g:420:5: lv_definition_1_0= RULE_STRING
            {
            lv_definition_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_definition_1_0, grammarAccess.getCssSelectorAccess().getDefinitionSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCssSelectorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"definition",
            						lv_definition_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCssSelector"


    // $ANTLR start "entryRuleUrlPatternSelector"
    // InternalConfigurationLanguage.g:440:1: entryRuleUrlPatternSelector returns [EObject current=null] : iv_ruleUrlPatternSelector= ruleUrlPatternSelector EOF ;
    public final EObject entryRuleUrlPatternSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUrlPatternSelector = null;


        try {
            // InternalConfigurationLanguage.g:440:59: (iv_ruleUrlPatternSelector= ruleUrlPatternSelector EOF )
            // InternalConfigurationLanguage.g:441:2: iv_ruleUrlPatternSelector= ruleUrlPatternSelector EOF
            {
             newCompositeNode(grammarAccess.getUrlPatternSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUrlPatternSelector=ruleUrlPatternSelector();

            state._fsp--;

             current =iv_ruleUrlPatternSelector; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUrlPatternSelector"


    // $ANTLR start "ruleUrlPatternSelector"
    // InternalConfigurationLanguage.g:447:1: ruleUrlPatternSelector returns [EObject current=null] : (otherlv_0= 'url' otherlv_1= 'pattern' ( (lv_definition_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleUrlPatternSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_definition_2_0=null;


        	enterRule();

        try {
            // InternalConfigurationLanguage.g:453:2: ( (otherlv_0= 'url' otherlv_1= 'pattern' ( (lv_definition_2_0= RULE_STRING ) ) ) )
            // InternalConfigurationLanguage.g:454:2: (otherlv_0= 'url' otherlv_1= 'pattern' ( (lv_definition_2_0= RULE_STRING ) ) )
            {
            // InternalConfigurationLanguage.g:454:2: (otherlv_0= 'url' otherlv_1= 'pattern' ( (lv_definition_2_0= RULE_STRING ) ) )
            // InternalConfigurationLanguage.g:455:3: otherlv_0= 'url' otherlv_1= 'pattern' ( (lv_definition_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getUrlPatternSelectorAccess().getUrlKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getUrlPatternSelectorAccess().getPatternKeyword_1());
            		
            // InternalConfigurationLanguage.g:463:3: ( (lv_definition_2_0= RULE_STRING ) )
            // InternalConfigurationLanguage.g:464:4: (lv_definition_2_0= RULE_STRING )
            {
            // InternalConfigurationLanguage.g:464:4: (lv_definition_2_0= RULE_STRING )
            // InternalConfigurationLanguage.g:465:5: lv_definition_2_0= RULE_STRING
            {
            lv_definition_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_definition_2_0, grammarAccess.getUrlPatternSelectorAccess().getDefinitionSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUrlPatternSelectorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"definition",
            						lv_definition_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUrlPatternSelector"


    // $ANTLR start "entryRuleProperty"
    // InternalConfigurationLanguage.g:485:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalConfigurationLanguage.g:485:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalConfigurationLanguage.g:486:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalConfigurationLanguage.g:492:1: ruleProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'by' ( (lv_selector_4_0= ruleContentSelector ) ) )? ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_selector_4_0 = null;



        	enterRule();

        try {
            // InternalConfigurationLanguage.g:498:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'by' ( (lv_selector_4_0= ruleContentSelector ) ) )? ) )
            // InternalConfigurationLanguage.g:499:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'by' ( (lv_selector_4_0= ruleContentSelector ) ) )? )
            {
            // InternalConfigurationLanguage.g:499:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'by' ( (lv_selector_4_0= ruleContentSelector ) ) )? )
            // InternalConfigurationLanguage.g:500:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'by' ( (lv_selector_4_0= ruleContentSelector ) ) )?
            {
            // InternalConfigurationLanguage.g:500:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalConfigurationLanguage.g:501:4: (lv_name_0_0= RULE_ID )
            {
            // InternalConfigurationLanguage.g:501:4: (lv_name_0_0= RULE_ID )
            // InternalConfigurationLanguage.g:502:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getAsKeyword_1());
            		
            // InternalConfigurationLanguage.g:522:3: ( (otherlv_2= RULE_ID ) )
            // InternalConfigurationLanguage.g:523:4: (otherlv_2= RULE_ID )
            {
            // InternalConfigurationLanguage.g:523:4: (otherlv_2= RULE_ID )
            // InternalConfigurationLanguage.g:524:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getTypeContentTypeCrossReference_2_0());
            				

            }


            }

            // InternalConfigurationLanguage.g:535:3: (otherlv_3= 'by' ( (lv_selector_4_0= ruleContentSelector ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalConfigurationLanguage.g:536:4: otherlv_3= 'by' ( (lv_selector_4_0= ruleContentSelector ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getByKeyword_3_0());
                    			
                    // InternalConfigurationLanguage.g:540:4: ( (lv_selector_4_0= ruleContentSelector ) )
                    // InternalConfigurationLanguage.g:541:5: (lv_selector_4_0= ruleContentSelector )
                    {
                    // InternalConfigurationLanguage.g:541:5: (lv_selector_4_0= ruleContentSelector )
                    // InternalConfigurationLanguage.g:542:6: lv_selector_4_0= ruleContentSelector
                    {

                    						newCompositeNode(grammarAccess.getPropertyAccess().getSelectorContentSelectorParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_selector_4_0=ruleContentSelector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyRule());
                    						}
                    						set(
                    							current,
                    							"selector",
                    							lv_selector_4_0,
                    							"de.tgremple.siteanalyser.configuration.ConfigurationLanguage.ContentSelector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008002L});

}