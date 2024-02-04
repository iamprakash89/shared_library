def call(Map stageParams){
    checkout([
        $class: 'GITSCM',
        branches: [[ name: stageParams.branch ]],
        userRemoteConfigs: [[ url: stageParams.url ]]
    ])
}